/**
 * Created by david on 23/02/17.
 */
public class Video {

    private double size = 0;
    private Server data_center = new Server();
    private Server[] cache;

    Video(double size, Server data_center, int caches){
        cache = new Server[caches];
        for(int ii = 0; ii < caches; ii++){
            cache[ii] = new Server();
            this.size = size;
            
        }
    }

}