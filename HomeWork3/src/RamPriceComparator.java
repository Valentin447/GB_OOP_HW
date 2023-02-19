import java.util.Comparator;

public class RamPriceComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook n1, Notebook n2) {
        if (n1.ram < n2.ram) {
            return -1;
        } else if (n1.ram > n2.ram) {
            return 1;
        } else if (n1.price < n2.price) {
            return -1;
        } else if (n1.price > n2.price) {
            return 1;
        }
        return 0;
    }
}
