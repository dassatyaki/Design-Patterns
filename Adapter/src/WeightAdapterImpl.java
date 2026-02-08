public class WeightAdapterImpl implements WeightAdapter{

    WeightMachine machine;

    public WeightAdapterImpl(WeightMachine machine) {
        this.machine = machine;
    }
    @Override
    public double getWeightinKg() {
        return machine.getWeightinPounds() * 0.45;
    }
}
