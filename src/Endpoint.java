public class Endpoint {

    private int id;
    private double dataCenterLatency;
    private double[] serverLatency;
    private double connections; // number of connections without counting the connection to DataCenter
    private double[] connectedServers;


    Endpoint(int id, double dataCenterLatency, double connections){
        this.id = id;
        this.dataCenterLatency = dataCenterLatency;
        this.connections = connections;
        if (connections > 0) {
            this.latencyToServers = new double[connections];
            this.connectedServers = new double[connections];
        }
    }


    public double getLatencyToDataCenter() {
        return latencyToDataCenter;
    }

    public void setLatencyToDataCenter(double latencyToDataCenter) {
        this.latencyToDataCenter = latencyToDataCenter;
    }

    public double getNumberOfConnections() {
        return numberOfConnections;
    }

    public void setNumberOfConnections(double numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    public double[] getLatencyToServers() {
        return latencyToServers;
    }

    public void setLatencyToServers(double[] latencyToServers) {
        this.latencyToServers = latencyToServers;
    }

    public double[] getConnectedServers() {
        return ConnectedServers;
    }

    public void setConnectedServers(double[] connectedServers) {
        ConnectedServers = connectedServers;
    }
}
