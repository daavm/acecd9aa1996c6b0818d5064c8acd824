/**
 * Created by santi on 23/02/2017.
 */
public class Main {
    public static void main(String[] args){
        ParseInput parser = new ParseInput("C:\\Users\\santi\\Downloads\\test.in");

        Video[] videos = parser.getVideos();
        Endpoint[] endpoints = parser.getEndpoints();

        int[] endpointsScores = new int[parser.getSizes()[1]];
        for(Video video : videos){
            int[] requests = video.getRequests();
            for(int i = 0; i <requests.length; i++){
                endpointsScores[i] += requests[i];
            }
        }

        Endpoint[] orderedEndpoints = new Endpoint[endpoints.length];
        int nordered = 0;
        while(nordered < endpoints.length){
            int max = 0;
            int maxEndpoint = -1;
            for(int i = 0; i < endpoints.length; i++){
                if(endpointsScores[i] > max){
                    max = endpointsScores[i];
                    maxEndpoint = i;
                }
            }

            orderedEndpoints[nordered] = endpoints[maxEndpoint];
            endpointsScores[maxEndpoint] = 0;
            nordered++;
        }

        String[] videosPerEndpoint = new String[orderedEndpoints.length];
        for(int v = 0; v < videos.length; v++){
            Video video = videos[v];
            int[] requests = video.getRequests();
            for(int i = 0; i < requests.length; i++){
                if(requests[i] > 0){
                    videosPerEndpoint[i] += v + ",";
                }
            }
        }


    }
}