public class VehicleFactory {
    static Vehicle vehicle;
    public Vehicle getVehicle(String type) {
        if (type.equals("Car"))
            vehicle = new Car();
        else if (type.equals("Truck"))
            vehicle = new Truck();
        else throw new IllegalArgumentException("");

        return vehicle;
    }
}
