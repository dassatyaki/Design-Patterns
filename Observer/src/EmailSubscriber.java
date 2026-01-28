public class EmailSubscriber implements Subscriber{

    private String name;

    public EmailSubscriber(String name)
    {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Sending mail to " + name);
    }
}
