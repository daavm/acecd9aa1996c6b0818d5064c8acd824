/**
 * Created by bobby on 2/23/17.
 */

public class Server {

    private double id;
    private double capacity;
    private double max = 500000;
    private int min = 1;

    Server(double id, double capacity, double max, int min){
        this.id = id;
        this.capacity = capacity;
        this.max = max;
        this.min = min;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

}
