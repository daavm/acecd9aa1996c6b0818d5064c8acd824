/**
 * Created by david on 23/02/17.
 */
public class Video {

    private double size = 0;
    private Server data_center;
    private Server[] cache;

    Video(double size, Server data_center, Server[] cache){

        setSize(size);
        setDataCenter(data_center);
        setCacheServers(cache);

    }

    public void setSize(double size){
        this.size = size;
    }

    public void setDataCenter(Server data_center){
        this.data_center = data_center;
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