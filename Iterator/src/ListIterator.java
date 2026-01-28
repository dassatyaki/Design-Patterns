import java.util.ArrayList;
import java.util.List;

public class ListIterator implements iterator{
    List<String> list = new ArrayList<>();
    int index = 0;

    public void add(String str)
    {
        list.add(str);
    }

    @Override
    public String next()
    {
        return list.get(index++);
    }

    @Override
    public boolean hasnext()
    {
        return index < list.size();
    }
}
