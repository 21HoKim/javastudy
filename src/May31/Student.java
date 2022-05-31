package May31;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+"("+age+")";
    }
    public int compareTo(Student o){
        return name.compareTo(o.name);
    }
}
