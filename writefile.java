package new1;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class writefile {



	    private static final InputStream InputStream = null;


		/**
	     * 把输入流中的所有内容赋值到输出流中
	     * @param in
	     * @param out
	     * @throws IOException
	     */
	    public void copy(InputStream in, OutputStream out) throws IOException {
	        byte[] buf = new  byte[4096];
	        int len = in.read(buf);
	        //read 是一个字节一个字节地读，字节流的结尾标志是-1
	        while (len != -1){
	            out.write(buf, 0, len);
	            len = in.read(buf);
	        }
	    }
	    public static void main(String[] args) throws IOException {
	        // TODO Auto-generated method stub
	    	writefile t = new writefile();
	        System.out.println("输入字符：");
	        t.copy(System.in, System.out);
	        
	        try {
	            //inFile 作为输入流的数据文件必须存在，否则抛出异常
	            File inFile = new File("e:///file1.txt");

	            //file2.txt没有，系统可以创建，在 workspace 的 Test 项目下可以找到
	            File outFile = new File("file2.txt");
	            FileInputStream fis = new FileInputStream(inFile);
	            FileOutputStream fos = new FileOutputStream(outFile);
	            int c;
	            while((c = fis.read()) != -1){
	                fos.write(c);
	            }
	            //打开了文件一定要记着关，释放系统资源
	            fis.close();
	            fos.close();
	        }catch(FileNotFoundException e) {
	            System.out.println("FileStreamsTest:" + e);
	        }catch(IOException e){
	            System.err.println("FileStreamTest:" + e);
	        }
	        byte[] buf = new  byte[4096];
	        FileInputStream in = null;
			int len = in.read(buf);
	        OutputStream OutputStream;
	        writefile writefile2=new writefile();
	        //writefile2.copy2(InputStream in, OutputStream out);
	    }
	        

	    public void copy2(InputStream in, OutputStream out) throws IOException {
	        out = new BufferedOutputStream(out, 4096);
	        byte[] buf = new byte[4096];
	        int len = in.read(buf);
	        while (len != -1) {
	        out.write(buf, 0, len);
	        len = in.read(buf);
	        }
	        //最后一次读取得数据可能不到4096字节
	        out.flush();
	    }
	    
	    
}

	
