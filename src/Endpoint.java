public class Endpoint {

    private int id;
    private double dataCenterLatency;
    private double[] latencyToServers;
    private int connections; // number of connections without counting the connection to DataCenter
    private double[] connectedServers;

    Endpoint(int id, double dataCenterLatency, int connections){
        this.id = id;
        this.dataCenterLatency = dataCenterLatency;
        this.connections = connections;
        if (connections > 0) {
            this.latencyToServers = new double[connections];
            this.connectedServers = new double[connections];
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDataCenterLatency() {
        return dataCenterLatency;
    }

    public void setDataCenterLatency(double dataCenterLatency) {
        this.dataCenterLatency = dataCenterLatency;
    }

    public double[] getLatencyToServers() {
        return latencyToServers;
    }

    public void setLatencyToServers(double[] latencyToServers) {
        this.latencyToServers = latencyToServers;
    }

    public int getConnections() {
        return connections;
    }

    public void setConnections(int connections) {
        this.connections = connections;
    }

    public double[] getConnectedServers() {
        return connectedServers;
    }

    public void setConnectedServers(double[] connectedServers) {
        this.connectedServers = connectedServers;
    }

}
