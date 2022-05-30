package May30;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileIO {
    public static void main(String[] args) {
        File inFile = new File("infile.txt");
        readByteFile(inFile);
        

        File outFile = new File(("outfile.txt"));
        writeByteFile(outFile);

        File in = new File("test.txt");
        File out = new File("test_2.txt");
        FileCopy(in, out);

        readCharFile(inFile);
        writeCharFile(outFile);

    }

    public static void writeCharFile(File outFile) {
        try{
            FileWriter fr = new FileWriter(outFile);
            fr.write('가');
            fr.write("나다라마다사");
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readCharFile(File inFile) {
        try{
            FileReader fr = new FileReader(inFile);
            int data;
            while((data=fr.read())!=-1){
                System.out.print((char)data);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void FileCopy(File in, File out) {
        FileInputStream fis = null;
        FileOutputStream fos;
        int d;
        try {
            fis = new FileInputStream(in);
            fos = new FileOutputStream(out);

            while((d= fis.read())!=-1){
                fos.write(d);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeByteFile(File outFile) {
        try {
            FileOutputStream fos = new FileOutputStream(outFile,true);
            fos.write( 'a');
            fos.write("가나다\n".getBytes());
            fos.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readByteFile(File inFile) {
        try {
            FileInputStream fis = new FileInputStream(inFile);
            int data ;
            while((data=fis.read())!=-1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
