package June07;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTest {
    public static void main(String[] args) {
        String[] nameArr = new String[]{ "철수","영희","흥민","현진"};
        Integer[] intArr = new Integer[]{123,234,345,456};
        IdCard[] idCardArr = new IdCard[]{new IdCard("철수",12345),
                new IdCard("영희",23456),
                new IdCard("흥민",13579),
                new IdCard("현진",12300)};
        /*
        for(int i=0; i<idCardArr.length;i++){
            System.out.println(idCardArr[i]);
        }
        System.out.println(Arrays.toString(idCardArr));
        System.out.println();

        System.out.println(Arrays.toString(nameArr));
        System.out.println();
        Arrays.sort(nameArr);
        System.out.println(Arrays.toString(nameArr));
        System.out.println();
        Arrays.sort(intArr);
        System.out.println();
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(idCardArr);
        System.out.println(Arrays.toString(idCardArr)); */
        ArrayList<String> nameAL = new ArrayList<>();
        ArrayList<Integer> intAL=new ArrayList<>();
        ArrayList<IdCard> idcAL = new ArrayList<>();
        for(int i=0;i<nameArr.length;i++){
            nameAL.add(nameArr[i]);
            intAL.add(intArr[i]);
            idcAL.add(idCardArr[i]);
            idcAL.add(new IdCard(nameArr[i], intArr[i]));
        }
        System.out.println(idcAL);
        idcAL.add(2, new IdCard("석열",500));
        System.out.println(idcAL);
        idcAL.remove(1);
        System.out.println(idcAL);
        idcAL.sort(null);
        System.out.println(idcAL);

        long start=System.nanoTime();
        int result=0;
        for(int i=1;i<=100000;i++){
            result = result+i;
        }
        start = System.nanoTime() - start;
        System.out.println("Time : "+start);

       // System.out.println(nameAL);
/*
        nameAL.remove("영희");
        System.out.println(nameAL);
        nameAL.add(0,"순희");
        System.out.println(nameAL);
        nameAL.add("재명");
        System.out.println(nameAL);
        nameAL.set(nameAL.indexOf("재명"), "석열");
        System.out.println(nameAL);

        System.out.println(intAL);
        intAL.remove(1);
        System.out.println(intAL);
        intAL.add(1,500);
        System.out.println(intAL);
        intAL.set(2,700);
        System.out.println(intAL);*/
    }
}
