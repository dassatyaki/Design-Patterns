public class Controller {

    Approver supervisor;
    Approver manager;
    Approver director;

    public Controller() {
        supervisor = new Supervisor();
        manager = new Manager();
        director = new Director();
    }

    public void setNext() {
        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);
    }
}
