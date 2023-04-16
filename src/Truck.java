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

    public void checkTrailer() {
        int trailer = 0;
        while (trailer < getWheelsCount()) {
            trailer++;
        }
        System.out.println("Проверяем прицеп");
        System.out.println();
    }
}

