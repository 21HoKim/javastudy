package May09;

class AA{
    void abc(){
        System.out.println("class A");
    }
}
class BB extends AA{
    @Override
    void abc(){
        System.out.println("class B");
    }
    void bcb(){
        super.abc();
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        BB b = new BB();
        b.abc();
        b.bcb();
    }
}