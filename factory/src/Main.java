public class Main {
    public static void main(String[] args) {
        VehicleFactory v = new VehicleFactory();

        Vehicle v1 = v.getVehicle("Car");
        Vehicle v2 = v.getVehicle("Truck");

        v1.horn();
        v2.horn();
    }
}