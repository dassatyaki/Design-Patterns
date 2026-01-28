public class MercedesFactory implements VehicleFactory{
    @Override
    public Vehicle create() {
        return new Mercedes();
    }
}
