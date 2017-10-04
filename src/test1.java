public class test1  {
    public static void main(String[] args) {
        C c = new C();
        E e = new E();
        System.out.println(e.show(c));
    }

}
class A {
    public String show (D odj) {
        return ("A and D");
    }
}
class B extends A {
    public String show (D odj) {
        return ("B and D");
    }
}
class C extends B {
    public String show (B odj) {
        return ("C and B");
    }
}
class D extends C {
    public String show (A odj) {
        return ("D and A");
    }
}
class E extends D {
    public String show (A odj) {
        return ("E and A");
    }
}

