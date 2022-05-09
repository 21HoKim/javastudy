package May03;

abstract class Animal{
    abstract void cry();
}
class Bird extends Animal{
    @Override
    void cry(){
        System.out.println("짹짹");
    }
}
class Dog extends Animal{
    @Override
    void cry(){
        System.out.println("멍멍");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal[] animals = {new Bird(),new Dog()};
        for(Animal a : animals){
            a.cry();
        }
        /*
        Bird b = new Bird();
        b.cry(); //Bird
        Dog d = new  Dog();
        d.cry(); //Dog
         */

    }

}
