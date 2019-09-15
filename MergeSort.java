package new1;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arrays, int left, int right) {
//        ������黹���Բ��
        if (left < right) {
            //������м�λ��
            int middle = (left + right) / 2;
            //����������
            mergeSort(arrays, left, middle);
            //����ұ�����
            mergeSort(arrays, middle + 1, right);
            //�ϲ�
            merge(arrays, left, middle, right);

        }
    }


    /**
     * �ϲ�����
     */
    public static void merge(int[] arr, int left, int middle, int right) {
        //����ϲ��ռ� ��СΪ�����Ѿ���������֮��
        int[] temp = new int[right - left + 1];
        //i �� jΪ�����Ѿ��ź�����������ʼλ��
        int i = left;
        int j = middle + 1;
        int k = 0;
        //����
        while (i <= middle && j <= right) {
            //���Ƚ�С���������ϲ��ռ�
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //�����ʣ��Ԫ��д��ϲ��ռ�
        while (i <= middle) {
            temp[k++] = arr[i++];
        }
        //���ұ�ʣ���Ԫ��д��ϲ��ռ�
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        //������������д��ԭ��������
        for (int l = 0; l < temp.length; l++) {
            arr[l + left] = temp[l];
        }

    }

    public static void main(String[] args) {
        int[] ints = {5, 3, 4, 1, 2};
        mergeSort(ints,0,ints.length-1);
        System.out.println(Arrays.toString(ints));
    }
}
