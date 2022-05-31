package May31;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Collection {
    public static void main(String[] args) {
        Student[] stdArr = new Student[]{
                new Student("철수",25),new Student("명희",21), new Student("영언",22), new Student("성호",25)
        };
        System.out.println(Arrays.toString(stdArr));
        Arrays.sort(stdArr);
        System.out.println(Arrays.toString(stdArr));
    }
    void intTest(){
        int[] intArr=new int[100];
        Random rand = new Random();
        for(int i=0;i<100;i++) {
            intArr[i]=rand.nextInt(100);
        }
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.binarySearch(intArr,10));
    }

    void stringTest(){
        String[] strArr = new String[]{"aa","ab","aaa","bb","xax","xxx","xyz"};
        int i1=0;
        while(strArr[i1]!="aaaa"){
            i1++;
            if(i1>=strArr.length){
                break;
            }
        }
        System.out.println("i:"+i1);

        /*
        for(int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]+"");
        }
        */
        //System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        int loc=Arrays.binarySearch(strArr,"xyz");
        System.out.println(loc);
    }
}
