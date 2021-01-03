package arraylist;

class MouseTrap {
    static void caughtYa(Object n) {
        Mouse mouse = (Mouse)n;
        System.out.println("Mouse:" + mouse.getNumber());
    }
}