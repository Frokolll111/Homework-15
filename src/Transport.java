public abstract class Transport implements Serviceable {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println(getModelName());
        System.out.println("Меняем покрышку " + getWheelsCount());
        System.out.println();
    }
    @Override
    public void service() {
    for (int i = 0; i < wheelsCount; i++) {
    }
        updateTyre();
}
}
