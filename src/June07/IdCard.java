package June07;

public class IdCard implements Comparable<IdCard>{

    String name;
    Integer number;
    public IdCard(String name, int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return
                "" + name + ":"
                 + number
                ;
    }


    @Override
    public int compareTo(IdCard o) {
        return number.compareTo(o.number);
    }
}
