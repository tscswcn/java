package new1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class DataStream {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        //向文件 a.txt 写入
        FileOutputStream fos = new FileOutputStream("aa.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        try {
            dos.writeBoolean(true);
            dos.writeByte((byte)123);
            dos.writeChar('J');
            dos.writeDouble(3.1415926);
            dos.writeFloat(2.122f);
            dos.writeInt(123);
        }
        finally {
            dos.close();
        }
        //从文件 a.txt 读出
        FileInputStream fis = new FileInputStream("a.txt");
        DataInputStream dis = new DataInputStream(fis);
        try {
            System.out.println("\t" + dis.readBoolean());
            System.out.println("\t" + dis.readByte());
            System.out.println("\t" + dis.readChar());
            System.out.println("\t" + dis.readDouble());
            System.out.println("\t" + dis.readFloat());
            System.out.println("\t" + dis.readInt());
        }
        finally {
            dis.close();
        }
        
        
        FileInputStream f1,f2;
        String s;
        f1 = new FileInputStream("file1.txt");
        f2 = new FileInputStream("file2.txt");
        SequenceInputStream fs = new SequenceInputStream(f1,f2);
        DataInputStream ds = new DataInputStream(fs);
        while((s = ds.readLine()) != null) {
            System.out.println(s);
        }
    }

}