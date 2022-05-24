package May24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        int data;
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] bs=new byte[fis.available()];
            int i=0;
            while((data=fis.read())!=-1){
                bs[i++]=(byte)data;

            }
            String str = new String(bs);
            System.out.print(new String(str));
            fis.close();



        } catch (IOException e) {
            // System.out.println("파일없는데? 확인 ㄱ");
            e.printStackTrace();
        }

    }
}
