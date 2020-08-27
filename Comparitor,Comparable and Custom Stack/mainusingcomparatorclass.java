package Day6;

import java.util.*;

public class mainusingcomparatorclass
{
    public static void main(final String[] args) {
        final Set<Product> set = new TreeSet<Product>();
        set.add(new Product(10, "macbook pro", 10));
        set.add(new Product(2, "windows pro", 7));
        set.add(new Product(30, "android", 8));
        set.add(new Product(5, "ipad pro ", 9));
        final List<Product> tempList = new ArrayList<Product>();
        tempList.addAll(set);
        Collections.sort(tempList, new ComparatorClass());
        for (final Product p : tempList) {
            System.out.println(p);
        }
        System.out.println("****************");
        display_(tempList);
    }
    
    public static void display_(final Collection<Product> list) {
        for (final Product p : list) {
            System.out.println(p);
        }
    }
}