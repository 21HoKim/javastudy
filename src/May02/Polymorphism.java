package May02;

class A{}
class B extends A{}
class C extends B{}
class D extends B{}
public class Polymorphism {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b2 = new B();
        B b1 = new D(); //B 타입의 객채를 D 생성자호출
        // B b3  = new A(); //B 타입의 객채를 A생성자 호출 -> B에는 A의 생성자가 상속되지 않아 오류 발생

    }
}
