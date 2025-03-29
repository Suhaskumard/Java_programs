class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }
}

class Inner {
    void display() {
        Outer outer = new Outer();
        System.out.println("display: outer_x " + outer.outer_x);
    }
}

public class NestedClassTopic {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
