public class Truck extends TransportEngine {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
        checkTrailer();
    }
}

