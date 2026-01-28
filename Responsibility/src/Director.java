public class Director extends Approver{

    @Override
    public void approve(int leaves) {
        if(leaves <= 15)
            System.out.println("Leave approved by director");
        else if (nextApprover != null)
            nextApprover.approve(leaves);
        else
            System.out.println("Approval denied");
    }
}
