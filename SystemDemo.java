package new1;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 10, 11};
        int[] b = {1, 2, 3, 4, 5, 6};
        int[] c = {11, 22, 33, 44, 55, 66};
        //从数组a的第二个元素开始，复制到b数组的第三个位置 复制的元素长度为3
        System.arraycopy(a, 1, b, 2, 3);
        
        System.arraycopy(a, 1, c, 2, 3);
        //输出结果
        System.out.println(Arrays.toString(b));
        System.out.println("ddsfds"+Arrays.toString(c));
        System.out.println("当前时间：" + System.currentTimeMillis());
        System.out.println("java版本信息：" + System.getProperty("java.version"));
        //运行垃圾收集器
        System.gc();
        //退出
        //System.exit(0);
        
        
       System.arraycopy(c,1,b,2,3);
       System.out.println("ddsfds"+Arrays.toString(c));
      //返回以毫秒为单位的当前时间(从1970年到现在的毫秒数)
      System.out.println(System.currentTimeMillis());
      //终止当前正在运行的Java虚拟机，status为 0时退出
     
      //  运行垃圾收集器
       System.out.println(System.currentTimeMillis());
       //终止当前正在运行的Java虚拟机，status为 0时退出
        System.gc();
      // 取得当前系统的全部属性
     // public static Properties getProperties()
      //获取指定键的系统属性
      System.getProperty("hostname");
      System.exit(0);
    }
}
