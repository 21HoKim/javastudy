package May02;
class AA{}
class BB extends AA{}
class CC extends BB{}
public class Casting {
    public static void main(String[] args) {
        //업캐스팅
        BB b1 = new BB();
        AA a1 = b1;

        CC c2 = new CC();
        BB b2 = c2;
        AA a2 = c2;

        //다운캐스팅
        AA aa1=new AA();
        BB bb1=(BB)aa1; //예외 발생

        AA aa2=new BB();
        BB bb2=(BB)aa2; // 가능
        CC cc2=(CC)aa2; //예외발생
    }
}
