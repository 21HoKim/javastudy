class Student{
    private static int number;
    private static String name;
    static int serialNumber=0;
    {serialNumber++;}
    public void studentPrint(){
        System.out.println(serialNumber+", "+number+", "+name);
    }
    public Student(int number, String name){
        this.number=number;
        this.name=name;
    }
    public Student(){
        this.number=0;
        this.name=" ";
    }
}
public class JAVASTUDY{
    public static void main(String[] args){
        Student stu1 = new Student(20342837,"제임슨");
        stu1.studentPrint();
        Student stu2 = new Student(21214567,"토마스");
        stu2.studentPrint();
    }
}

