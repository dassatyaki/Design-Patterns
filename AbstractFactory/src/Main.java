public class Main{
    public static void main(String [] args) {
        VehicleFactory bmwFactory = new BmwFactory();
        VehicleFactory mercedesFactory = new MercedesFactory();

        Vehicle bmw = bmwFactory.create();
        Vehicle mercedes = mercedesFactory.create();

        bmw.horn();
        mercedes.horn();
    }
}