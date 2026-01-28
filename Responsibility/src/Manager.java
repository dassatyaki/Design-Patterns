public class Manager extends Approver{

    @Override
    public void approve(int leaves) {
        if(leaves <= 10)
            System.out.println("Leave approved by manager");
        else if (nextApprover != null)
            nextApprover.approve(leaves);
    }
}
