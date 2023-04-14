public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
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
        int engine = 0;
        while (engine > getWheelsCount()) {
            engine++;
        }
        System.out.println("Проверяем двигатель");
        int trailer = 0;
        while (trailer > getWheelsCount()) {
            trailer++;
        }
        System.out.println("Проверяем прицеп");
        System.out.println();
    }
}
