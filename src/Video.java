/**
 * Created by david on 23/02/17.
 */
public class Video {

    private double size = 0;
    private Server data_center;
    private Server[] cache;
    private int id;
    private int[] requests;

    Video(double size,int id){//, Server data_center, Server[] cache){

        setSize(size);
        setId(id);
        setDataCenter(data_center);
        setCacheServers(cache);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSize(double size){
        this.size = size;
    }

    public void setRequests(int[] requests){
        this.requests = requests;
    }

    public void setDataCenter(Server data_center){
        this.data_center = data_center;
    }

    public int getRequestsAt(int endpoint){
        return requests[endpoint];
    }

    public void setCacheServers(Server[] cache){
        this.cache = cache;
    }

    public double getSize(){
        return this.size;
    }

    public Server[] getCache(){
        return this.cache;
    }

}