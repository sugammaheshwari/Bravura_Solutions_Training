package Day6;

import java.util.*;

public class ComparatorClass implements Comparator<Product>
{
    @Override
    public int compare(final Product o1, final Product o2) {
        return o1.pid - o2.pid;
    }
}