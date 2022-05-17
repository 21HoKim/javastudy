package May17;

interface A{
     void abc();
     default void bdd(){
         System.out.println(" default method ");
     }
}

class B implements A{
    @Override
    public void abc(){
        System.out.println(" abstract method implements ");
    }
    @Override
    public void bdd(){
        A.super.bdd();
        System.out.println(" override method ");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        B b= new B();
        b.abc();
        b.bdd();
    }
}
