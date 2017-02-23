/**
 * Created by santi on 23/02/2017.
 */
public class Main {
    public static void main(String[] args){
        ParseInput parser = new ParseInput("C:\\Users\\santi\\Desktop\\test.in");

        Video[] videos = parser.getVideos();
        Endpoint[] endpoints = parser.getEndpoints();

        for(Video video : videos){
            System.out.println("Video #" + video.getId() + " has a size of " + video.getSize() + " MB");
        }
    }
}
