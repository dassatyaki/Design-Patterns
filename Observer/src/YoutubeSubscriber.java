public class YoutubeSubscriber implements Subscriber{

    private String name;

    public YoutubeSubscriber(String name)
    {
        this.name = name;
    }

    @Override
    public void update()
    {
        System.out.println(name + " watching video");
    }
}
