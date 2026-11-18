class A {
    A(int x) {
        System.out.println("A constructor: " + x);
    }
}

class B extends A {
    B(int y) {
        super(y + 10);
        System.out.println("B constructor: " + y);
    }
}

class C extends B {
    C(int z) {
        super(z + 20);
        System.out.println("C constructor: " + z);
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C(10);
    }
}