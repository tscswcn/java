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
	     * ���������е��������ݸ�ֵ���������
	     * @param in
	     * @param out
	     * @throws IOException
	     */
	    public void copy(InputStream in, OutputStream out) throws IOException {
	        byte[] buf = new  byte[4096];
	        int len = in.read(buf);
	        //read ��һ���ֽ�һ���ֽڵض����ֽ����Ľ�β��־��-1
	        while (len != -1){
	            out.write(buf, 0, len);
	            len = in.read(buf);
	        }
	    }
	    public static void main(String[] args) throws IOException {
	        // TODO Auto-generated method stub
	    	writefile t = new writefile();
	        System.out.println("�����ַ���");
	        t.copy(System.in, System.out);
	        
	        try {
	            //inFile ��Ϊ�������������ļ�������ڣ������׳��쳣
	            File inFile = new File("e:///file1.txt");

	            //file2.txtû�У�ϵͳ���Դ������� workspace �� Test ��Ŀ�¿����ҵ�
	            File outFile = new File("file2.txt");
	            FileInputStream fis = new FileInputStream(inFile);
	            FileOutputStream fos = new FileOutputStream(outFile);
	            int c;
	            while((c = fis.read()) != -1){
	                fos.write(c);
	            }
	            //�����ļ�һ��Ҫ���Źأ��ͷ�ϵͳ��Դ
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
	        //���һ�ζ�ȡ�����ݿ��ܲ���4096�ֽ�
	        out.flush();
	    }
	    
	    
}

	
