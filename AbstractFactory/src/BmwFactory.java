public class BmwFactory implements VehicleFactory{
    @Override
    public Vehicle create() {
        return new BMW();
    }
}
