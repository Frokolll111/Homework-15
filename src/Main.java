
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda",4);
        Car car2 = new Car("Nissan",4);

        Truck truck = new Truck("КАМАЗ 55111", 6);
        Truck truck2 = new Truck("MAN TGX", 8);

        Bicycle bicycle = new Bicycle("Scott Sub Cross 50 Men",2);
        Bicycle bicycle2 = new Bicycle("Fuji Feather",2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}