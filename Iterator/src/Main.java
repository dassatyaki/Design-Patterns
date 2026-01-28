public class Main {
    public static void main(String[] args)
    {
        ListIterator l = new ListIterator();
        l.add("Satyaki");
        l.add("Aditya");

        while(l.hasnext()) {
            System.out.println(l.next());
        }
    }
}
