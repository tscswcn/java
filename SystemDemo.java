package new1;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 10, 11};
        int[] b = {1, 2, 3, 4, 5, 6};
        int[] c = {11, 22, 33, 44, 55, 66};
        //������a�ĵڶ���Ԫ�ؿ�ʼ�����Ƶ�b����ĵ�����λ�� ���Ƶ�Ԫ�س���Ϊ3
        System.arraycopy(a, 1, b, 2, 3);
        
        System.arraycopy(a, 1, c, 2, 3);
        //������
        System.out.println(Arrays.toString(b));
        System.out.println("ddsfds"+Arrays.toString(c));
        System.out.println("��ǰʱ�䣺" + System.currentTimeMillis());
        System.out.println("java�汾��Ϣ��" + System.getProperty("java.version"));
        //���������ռ���
        System.gc();
        //�˳�
        //System.exit(0);
        
        
       System.arraycopy(c,1,b,2,3);
       System.out.println("ddsfds"+Arrays.toString(c));
      //�����Ժ���Ϊ��λ�ĵ�ǰʱ��(��1970�굽���ڵĺ�����)
      System.out.println(System.currentTimeMillis());
      //��ֹ��ǰ�������е�Java�������statusΪ 0ʱ�˳�
     
      //  ���������ռ���
       System.out.println(System.currentTimeMillis());
       //��ֹ��ǰ�������е�Java�������statusΪ 0ʱ�˳�
        System.gc();
      // ȡ�õ�ǰϵͳ��ȫ������
     // public static Properties getProperties()
      //��ȡָ������ϵͳ����
      System.getProperty("hostname");
      System.exit(0);
    }
}
