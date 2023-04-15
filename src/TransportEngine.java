public  abstract  class TransportEngine extends  Transport {
    public TransportEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkEngine() {
        int engine = 0;
        while (engine < getWheelsCount()) {
            engine++;
        }
        System.out.println("Проверяем двигатель");
        System.out.println();
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
