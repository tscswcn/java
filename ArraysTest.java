package new1;

import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        int[] arr1 = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        Arrays.sort(arr);
        //List a= Arrays.asList(arr1)
        System.out.println(Arrays.binarySearch(arr, 33));
    }
}