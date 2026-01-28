abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver approver) {
        nextApprover = approver;
    }

    abstract void approve(int leaves);
}
