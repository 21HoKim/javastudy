package May23;

import java.io.File;

public class CreateFileObjects {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists()) {
            System.out.println(file.toString() + " is exists");
        } else {
            System.out.println(file + " is not exists");
        }

        System.out.println(file.getAbsolutePath() );
        System.out.println(System.getProperty("user.dir"));

        File f2 = new File("C:/Windows");
        System.out.println(f2.exists() );
        System.out.println(f2.isFile() );
        System.out.println(f2.isDirectory() );

        File w = new File("C:/Windows");
        String[] str = w.list();
        for(String s : str){
            //System.out.println(s);
        }
        File[] f = w.listFiles();
        for(File i : f){
            System.out.println(i);
        }

    }
}
