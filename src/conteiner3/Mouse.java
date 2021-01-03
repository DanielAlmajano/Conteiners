package conteiner3;

//Sobrecarga de el metodo String

public class Mouse {
    private int mouseNumber;
    Mouse(int i) {
        mouseNumber = i;
    }
    public String toString() {
        return "this is Mouse #" + mouseNumber;
    }
    public Integer getNumber() {
        return mouseNumber;
    }
}

