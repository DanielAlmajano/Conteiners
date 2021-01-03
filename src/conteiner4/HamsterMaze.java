package conteiner4;

import java.util.*;

//We using an iterator 

class Hamster {
    private int hamsterNumber;
    Hamster(int i) {
        hamsterNumber = i;
    }
    public String toString() {
        return "This is Hamster# " + hamsterNumber;
    }
}

class Printer {
    static void printAll(Iterator e) {
        while(e.hasNext()) {
            System.out.println(e.next());
        }
    }
}

public class HamsterMaze {
    public static void main(String[] args) {
        ArrayList v = new ArrayList();
        for (int i = 1; i < 7; i++) {
            v.add(new Hamster(i));
        }
        Printer.printAll(v.listIterator());
    }
}
