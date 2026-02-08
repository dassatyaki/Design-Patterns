public class WeightMachineImpl implements WeightMachine{
    private double weight;

    public WeightMachineImpl(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeightinPounds() {
        return weight;
    }
}
