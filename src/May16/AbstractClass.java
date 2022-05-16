package May16;

abstract class A{
    abstract void abc();
    void bcd(){
        System.out.println(" normal method");
    }
}
class B extends A{
    @Override
    void abc(){
        System.out.println(" override abstract method");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
     // A b1 = new A(); abstract 은 인스턴스화 할수 없음
    A b1 = new A(){
        @Override
        void abc() {
            System.out.println(" inner class method");
        }
    };
    A b2 = new B();
    b1.abc();
    b2.abc();
    b2.bcd();
    }
}
