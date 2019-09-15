package new1;

public class BinarySearch {
    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (high + low) / 2;
            //������ ����ֵ
            if (key == arr[middle]) {
                return key;
            } else if (key < arr[middle]) {
                //���keyС���м�ֵ����ô�ı�high��ֵ��������߲����Ƚ�С�Ĳ��֣�
                high = middle - 1;
            }else {
                //���key�����м�ֵ����ô�ı�low��ֵ�������ұ߲����Ƚϴ�Ĳ��֣�
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {5, 3, 4, 1, 2};
        System.out.println(search(ints, 4));
    }
}