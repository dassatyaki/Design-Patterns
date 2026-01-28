public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.setNext();

        controller.supervisor.approve(4);
        controller.supervisor.approve(10);
        controller.supervisor.approve(20);
    }
}
