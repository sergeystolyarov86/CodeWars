package Stolyarov_S;

import java.util.Arrays;

public class ArraysSorted {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={2,5,9,10};
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int [] result = Arrays.copyOf(a1, a1.length + a2.length);

        return result;
    }
}
