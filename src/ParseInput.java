import java.io.*;
import java.util.Stack;

/**
 * Created by santi on 23/02/2017.
 */
public class ParseInput {
    private int[] sizes = new int[5];
    private Stack<String> input;
    private Video[] videos;
    private Endpoint[] endpoints;

    ParseInput(String input){
        this.input = new Stack<>();
        File file = new File(input);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                this.input.add(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }

        int i = 0;
        for(String N : this.input.get(0).split(" ")){
            sizes[i] = Integer.parseInt(N);
            i++;
        }
        this.input.remove(0);

        //Parse videos
        this.videos = new Video[sizes[0]];
        String line[] = this.input.get(0).split(" ");
        for(int ii = 0; ii < sizes[0]; ii++){
            double videoSize = Double.parseDouble(line[ii]);
            this.videos[ii] = new Video(videoSize, ii);
            this.input.remove(0);
        }

        //Parse endpoints
        boolean reached = false;

        this.endpoints = new Endpoint[sizes[1]];
        i = 0;
        while(!reached){
            line = this.input.get(0).split(" ");
            if(line.length > 2){
                reached = true;
            } else {
                int latencyToDataCenter = Integer.parseInt(line[0]);
                int nConnections = Integer.parseInt(line[1]);

                Endpoint endpoint = new Endpoint(i, latencyToDataCenter, nConnections);
                double[] connectedServers = new double[nConnections];
                double[] latencyToServers = new double[nConnections];

                this.input.remove(0);

                for(int j = 0; j < nConnections; j++) {
                    line = this.input.get(0).split(" ");
                    connectedServers[j] = Double.parseDouble(line[0]);
                    latencyToServers[j] = Double.parseDouble(line[1]);
                    this.input.remove(0);
                }

                endpoint.setConnectedServers(connectedServers);
                endpoint.setLatencyToServers(latencyToServers);

                this.endpoints[i] = endpoint;
                i++;
            }
        }

        //Parse request descriptions
        for(Video video : this.videos){
            int[] requests = new int[sizes[1]];
            video.setRequests(requests);
        }
        for(int ii = 0; ii < sizes[2]; ii++){
            line = this.input.get(0).split(" ");
            int idVideo = Integer.parseInt(line[0]);
            int idEndpoint = Integer.parseInt(line[1]);
            int nRequests = Integer.parseInt(line[2]);

            int[] requests = this.videos[idVideo].getRequests();
            requests[idEndpoint] = nRequests;
            this.videos[idVideo].setRequests(requests);
            this.input.remove(0);
        }
    }

    public Video[] getVideos() {
        return videos;
    }

    public Endpoint[] getEndpoints() {
        return endpoints;
    }

    public double getCapacity(){
        return this.sizes[4];
    }

    public int[] getSizes() {
        return sizes;
    }
}
