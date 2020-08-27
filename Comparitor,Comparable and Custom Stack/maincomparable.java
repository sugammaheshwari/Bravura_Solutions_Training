package Day6;

import java.util.*;

public class maincomparable
{
    public static void main(final String[] args) {
        final Set<Product> set = new TreeSet<Product>();
        set.add(new Product(10, "macbook pro", 10));
        set.add(new Product(2, "windows pro", 7));
        set.add(new Product(30, "android", 8));
        System.out.println(set);
        System.out.println("****************");
        for (final Product p : set) {
            System.out.println(p);
        }
        System.out.println("****************");
        final Iterator<Product> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("****************");
    }
}