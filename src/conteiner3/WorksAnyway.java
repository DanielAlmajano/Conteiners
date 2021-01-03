package conteiner3;

class MouseTrap {
    static void caughtYa(Object n) {
        Mouse mouse = (Mouse)n;
        System.out.println("Mouse:" + mouse.getNumber());
    }
}

public class WorksAnyway {
    public static void main(String[] args) {
        ArrayList mice = new ArrayList();
        for (int i = 0; i < 3; i++) {
            mice.add(new Mouse(i));
        }
        for (int i = 0; i < mice.size(); i++) {
            System.out.println("Free mouse:" + mice.get(i));
            MouseTrap.caughtYa(mice.get(i));
        }
    }
}