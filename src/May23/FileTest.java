package May23;

public class FileTest {
    public static void main(String[] args) {
        String str = "가나다라asdfs1234";
        byte[] strByte = str.getBytes();
        for(byte b : strByte){
            System.out.print((char)b);
        }
    }
}
