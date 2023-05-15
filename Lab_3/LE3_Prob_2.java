public interface Testable {
    void display();
}

public class Test implements Testable {
    public void display() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
