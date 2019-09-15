package new1;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) {
            return;
        }
        //�����������ʼλ�� i ����λ��j ��׼ pivot Ϊ������м�
        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            //������С�ڻ�׼ ѭ�������� �൱��i������λ�õ�ֵΪ���ڻ�׼��Ԫ��
            while (arr[i] < pivot) {
                ++i;
            }
            //��������ڻ�׼ ѭ�������� �൱��j������λ�õ�ֵΪС���ڻ�׼��Ԫ��
            while (arr[j] > pivot) {
                --j;
            }
            //���i<j ��ô�򽫽���i j��Ӧλ�õ�ֵ
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                //��ָ������ƶ�
                ++i;
                --j;
            } else if (i == j) {
//���i=j ��ô˵�����������Ѿ����� ��i++ ������ﲻʹ��i++ ��ô�����sort(arr,i,tail)����Ϊarr(arr,i+1,tail)
                ++i;
            }
        }
        //����������ָ�  
        sort(arr, head, j);
        sort(arr, i, tail);
    }

    public static void main(String[] args) {
        int[] ints = {5, 3, 4, 1, 2};
        sort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }
}
