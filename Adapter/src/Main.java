public class Main {
    public static void main(String[] args) {
        WeightAdapter adapter = new WeightAdapterImpl(new WeightMachineImpl(100.0));
        System.out.println(adapter.getWeightinKg());
    }
}
