public class Car extends Transport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service(){
        System.out.println("Модель " + getModelName());
        int i = 0;
        while (i < getWheelsCount()) {
            i++;
        }
        System.out.println("Меняем " + getWheelsCount() + " покрышки");
        }
        @Override
        public void checkEngine() {
        int engine = 0;
        while (engine > getWheelsCount()) {
            engine++;
        }
        System.out.println("Проверяем двигатель");
            System.out.println();
    }

    @Override
    public void checkTrailer() {
    }
}
