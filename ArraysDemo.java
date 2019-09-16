package new1;
import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //������Ԫ�ض���Ϊ9
        Arrays.fill(arr, 9);
        System.out.println("fill:" + Arrays.toString(arr));
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            //ʹ��100���ڵ��������ֵ����
            arr[i] = random.nextInt(101);
        }
        //���¸�ֵ�������
        System.out.println("���¸�ֵ��" + Arrays.toString(arr));
        //������Ϊ5��Ԫ����Ϊ50
        arr[5] = 50;
        //����
        Arrays.sort(arr);
        //����������
        System.out.println("sort�����" + Arrays.toString(arr));
        //����50��λ��
        int i = Arrays.binarySearch(arr, 50);
        System.out.println("ֵΪ50��Ԫ��������"+i);
        //����һ��������
        int[] newArr = Arrays.copyOf(arr, arr.length);
        //�Ƚ�
        System.out.println("equals:"+Arrays.equals(arr, newArr));
    }
}