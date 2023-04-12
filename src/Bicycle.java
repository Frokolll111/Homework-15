public class Bicycle extends  Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super (modelName, wheelsCount);
    }
    @Override
    public void service() {
        System.out.println("Модель " + getModelName());
        int i = 0;
        while (i < getWheelsCount()) {
            i++;
        }
        System.out.println("Меняем " + getWheelsCount() + " покрышки");
        System.out.println();
    }
}
