package new1;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ints = {5, 3, 4, 1, 2};
        System.out.println(search(ints, 4));
    }

    public static int search(int[] arr, int key) {
        //ѭ��
        for (int i = 0; i < arr.length; i++) {
            //�Ƚ��Ƿ����key
            if (arr[i] == key) {
                return arr[i];
            }
        }
        //�Ҳ����ͷ���-1
        return -1;
    }
}