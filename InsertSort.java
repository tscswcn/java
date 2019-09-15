package new1;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                //对已经排序好的元素比较，找到一个比插入元素大的元素 交换位置
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {5, 3, 4, 1, 2};
        sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
