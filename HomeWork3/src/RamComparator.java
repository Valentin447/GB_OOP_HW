import java.util.Comparator;

public class RamComparator implements Comparator<Notebook> {

    @Override
    public int compare(Notebook n1, Notebook n2) {
        return n1.ram - n2.ram;
    }
}
