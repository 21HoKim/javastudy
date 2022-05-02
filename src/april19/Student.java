package april19;
class AA{
    int m;
    static int n=3;
    static{
        n=3;

    }
    public AA(){
        m=2;
        n=3;
    }
    public void AB(){

    }
}
public class Student {

    public static void main(String[] args) {
        AA a1 = new AA();
        System.out.println(a1.m);
        System.out.println(a1.n);
        System.out.println(AA.n);
    }
}
