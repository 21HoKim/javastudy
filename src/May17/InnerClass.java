package May17;

abstract class A1{
    abstract void abc();
}



public class InnerClass {
    public static void main(String[] args) {

        class B1 extends A1{
            @Override
            void abc(){
                System.out.println(" named inner class method ");
            }
        }

        B1 b = new B1();

        A1 a = new A1(){
            @Override
            void abc(){
                System.out.println(" anonymous inner class method ");
            }
        };
        b.abc();
        a.abc();
    }
}
