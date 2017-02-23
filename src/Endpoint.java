public class Endpoint {

    
    private int latencyToDataCenter;
    private int numberOfConnections; // without counting the connection to DataCenter
    private int latencyToServers[];
    private int ConnectedServers[];


    public int getLatencyToDataCenter() {
        return latencyToDataCenter;
    }

    public void setLatencyToDataCenter(int latencyToDataCenter) {
        this.latencyToDataCenter = latencyToDataCenter;
    }

    public int getNumberOfConnections() {
        return numberOfConnections;
    }

    public void setNumberOfConnections(int numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    public int[] getLatencyToServers() {
        return latencyToServers;
    }

    public void setLatencyToServers(int[] latencyToServers) {
        this.latencyToServers = latencyToServers;
    }

    public int[] getConnectedServers() {
        return ConnectedServers;
    }

    public void setConnectedServers(int[] connectedServers) {
        ConnectedServers = connectedServers;
    }

    public Endpoint(){}

}
