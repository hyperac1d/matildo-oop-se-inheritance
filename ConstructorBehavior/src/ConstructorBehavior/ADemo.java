package ConstructorBehavior;
public class ADemo {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A("A");
        A a2 = new A(1);
        A a3 = new A("A", 1);
        a3.getX();
        a3.getY();
        a3.setX("AB");
        a3.setY(69);
    }
}
