package collections;

import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Collections2.fill(c, Collections2.countries, 10);
        c.add("Ten");
        c.add("Eleven");
        System.out.println(c);
        String[] str = (String[])c.toArray(new String[1]);
        System.out.println("Collections.max(c)" + Collections.max(c));
        System.out.println("Collections.min(c)" + Collections.min(c));

        //Add collection in other collection
        Collection c2 = new ArrayList();
        Collections2.fill(c2, collections, );
    }
}