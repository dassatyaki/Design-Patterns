public class Supervisor extends Approver{

    @Override
   public void approve(int leaves) {
        if (leaves <= 5)
            System.out.println("Leave approved by supervisor");
        else if (nextApprover != null)
            nextApprover.approve(leaves);
    }
}
