public class Main {
    public static void main(String[] args) {
        Subscriber sub1 = new YoutubeSubscriber("Satyaki");
        Subscriber sub2 = new EmailSubscriber("Aditya");

        YoutubeChannel yt_channel = new YoutubeChannel();
        yt_channel.addSubscriber(sub1);
        yt_channel.addSubscriber(sub2);
        yt_channel.upload();
        yt_channel.removeSubscriber(sub1);
        yt_channel.upload();
    }

}
