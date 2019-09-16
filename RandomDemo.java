package new1;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        //随机生成一个整数 int范围
        System.out.println(random.nextInt());
        //生成 [0,n] 范围的整数  设n=100
        System.out.println(random.nextInt(100 + 1));
        //生成 [0,n) 范围的整数  设n=100
        System.out.println(random.nextInt(100));
        //生成 [m,n] 范围的整数  设n=100 m=40
        System.out.println((random.nextInt(100 - 40 + 1) + 40));
        //随机生成一个整数 long范围
        System.out.print(random.nextLong());
        //生成[0,1.0)范围的float型小数
        System.out.println(random.nextFloat());
        //生成[0,1.0)范围的double型小数
        System.out.println(random.nextDouble());
    
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Random random2 = new Random();
        System.out.println(random2.nextInt(n - m + 1) + m);
    }
}
