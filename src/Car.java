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
        System.out.println("Проверяем двигатель");
        System.out.println();
    }
}
