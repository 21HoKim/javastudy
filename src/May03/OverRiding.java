package May03;
class A{
    void print(){
        System.out.println("class A");
    }
}
class B{
    void print(){
        System.out.println("class B");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        new A().print();
        new B().print();
    }
}
