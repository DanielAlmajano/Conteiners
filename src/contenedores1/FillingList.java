package contenedores1;

import java.util.*;

public class FillingList {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("");
        }
        Collections.fill(list, "Hello");
        System.out.println(list);
    }
}
