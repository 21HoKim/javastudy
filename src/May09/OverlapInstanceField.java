package May09;

import java.util.Optional;

class A{
    static int m=3;
    static void print(){
        System.out.println("class A");
    }
}
class B extends A{
    static int m=5;
    //@Override
    static void print(){
        System.out.println("class B");
    }
}




public class OverlapInstanceField {
    public static void main(String[] args) {
        A a = new A();
        B b=new B();
        A ab=new B();
        System.out.println(a.m);
        System.out.println(b.m);
        System.out.println(ab.m);

        a.print();
        b.print();
        ab.print();
    }
}
