package finalModifier;

abstract class Animal{
    public int age=12;

    abstract void cry();
    void walk(){
        System.out.println("촵 ");
    }

}

class Bird extends Animal {
    int age=18;
    @Override
    void cry() {
        System.out.println("우엉 ");
    }
}

class Cat extends Animal{
    int age=5;
    @Override
    void cry() {
        System.out.println("에옹 ");
    }
}



class A{
    public static final int B= 50;
    void abc(){
        System.out.println("Final test A"+B);
    }
}
class B extends A{
    void abc(){
        System.out.println("Final test B");
    }
}
public class FinalModifier {
    public static void main(String[] args) {
        final int a=5;
        //System.out.println(a);
        Animal cat = new Cat();
        cat.cry();
        System.out.println(cat.age);
    }
}
