package alextym.com.task08;
import java.util.Comparator;

public class AutourNameComporator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String name1 = ((Book)o1).getAuthor();
        String name2 = ((Book)o2).getAuthor();
        return name1.compareTo(name2);
    }
}
