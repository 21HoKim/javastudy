package May02;
class Human {
    String name;
    int age;
    void eat(){}
    void sleep(){}
}
class Student extends Human{
    int studentID;
    void goToSchool(){}
}
class Worker extends Human{
    int workerID;
    void goToWork(){}
}
public class Inheritance {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();

        Student s = new Student();
        s.eat();
        s.goToSchool();
        s.sleep();

        Worker w = new Worker();
        w.eat();
        w.goToWork();
        w.sleep();

    }

}
