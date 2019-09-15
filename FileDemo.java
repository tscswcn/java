package new1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class  FileDemo {
    public static void main(String[] args){
        //ͬѧ�ǿ��Ը����Լ���·�����и���
        File f1 =new
        File("/home/project/1.txt");
        //File(String parent,String child)
        File f2 =new File("/home/project","2.txt");
        //separator ��ƽ̨�ָ���
        File f3 =new File("/home"+File.separator+"project");
        File f4 =new File(f3,"3.txt");

        try {
             System.out.println(f1);
                //���ļ�����ʱ���� false��������ʱ���� true
                System.out.println(f2.createNewFile());
                //���ļ�������ʱ���� false
                System.out.println(f3.delete());
        }catch(IOException e) {
                e.printStackTrace();
        }

        //�г������µ��ļ����ļ���
        File[] files =File.listRoots();
        for(File file:files){
            System.out.println(file);
            if(file.length()>0){
                String[] filenames =file.list();
                for(String filename:filenames){
                    System.out.println(filename);
                }
            }
        }
        
        int data_arr[] = {12, 32, 43, 45, 1, 5};
        try {
            RandomAccessFile randf=new RandomAccessFile("temp.dat","rw");
            for(int i = 0; i < data_arr.length; i++){
                randf.writeInt(data_arr[i]);
            }
            for(int i = data_arr.length-1 ; i >= 0; i--){
                //int ����ռ4���ֽ�
                randf.seek(i * 4L);
                System.out.println(randf.readInt());
            }
            randf.close();
        }catch(IOException e){
            System.out.println("File access error" + e);
        }

    }

}