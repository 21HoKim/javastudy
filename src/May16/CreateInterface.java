package May16;

abstract class One{

}
interface Two{ //여기 안의 메소드는 모두 abstract, 적어도 안적어도 똑같다
    void t();
    abstract void ad();
}
class Th implements Two{

    @Override
    public void t() {
        System.out.println("implemented method");
    }

    @Override
    public void ad() {
        System.out.println("implemented method 2");
    }
}
public class CreateInterface {
    public static void main(String[] args) {
        Two b0 = new Two() {
            @Override
            public void t() {
                System.out.println("inner interface method");
            }

            @Override
            public void ad() {

            }
        };

        Two b1 = new Th();
        Th b2=new Th();
        b0.t();
        b1.t();
        b2.ad();
    }
}
