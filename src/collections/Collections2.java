package collections;

import java.util.*;

public class Collections2 {
    //Complete array we need a generator
    public static void fill(Collection c, Generator gen, int count) {
        for (int i = 0; i < count; i++) {
            c.add(gen.next());
        }
    }
    public static void
    fill(Map m, MapGenerator gen, Integer count) {
        for(int i = 0; i < count; i++) {
            Pair p = gen.next();
            m.put(p.key, p.value);
        }
    }
    public static class RandStringPairGenerator implements MapGenerator {
        
    }
}
