/**
 * Created by david on 23/02/17.
 */
public class Video {

    private double size = 0;
    private Server data_center = new Server();
    private Server[] cache;

    Video(double size, Server data_center, double caches){

        setSize(size);
        setDataCenter(data_center);
        setCacheServers(caches);

    }

    public void setSize(double size){
        this.size = size;
    }

    public void setDataCenter(Server data_center){
        this.data_center = data_center;
    }

    public void setCacheServers(double caches){
        this.cache = new Server[caches];
        for(int ii = 0; ii < caches; ii++){
            this.cache[ii] = new Server();
        }
    }

    public double getSize(){
        return this.size;
    }

    public Server[] getCache(){
        return this.cache;
    }

}