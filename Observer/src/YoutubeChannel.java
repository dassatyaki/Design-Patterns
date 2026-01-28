import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Youtube {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void upload() {
        System.out.println("Video uploaded");
        notifySubscribers();
    }

    public void notifySubscribers()
    {
        for(Subscriber sub : subscribers)
        {
            sub.update();
        }
    }
}
