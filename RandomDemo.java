package new1;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        //�������һ������ int��Χ
        System.out.println(random.nextInt());
        //���� [0,n] ��Χ������  ��n=100
        System.out.println(random.nextInt(100 + 1));
        //���� [0,n) ��Χ������  ��n=100
        System.out.println(random.nextInt(100));
        //���� [m,n] ��Χ������  ��n=100 m=40
        System.out.println((random.nextInt(100 - 40 + 1) + 40));
        //�������һ������ long��Χ
        System.out.print(random.nextLong());
        //����[0,1.0)��Χ��float��С��
        System.out.println(random.nextFloat());
        //����[0,1.0)��Χ��double��С��
        System.out.println(random.nextDouble());
    
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Random random2 = new Random();
        System.out.println(random2.nextInt(n - m + 1) + m);
    }
}
