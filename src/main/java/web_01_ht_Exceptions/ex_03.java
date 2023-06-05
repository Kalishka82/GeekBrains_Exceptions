package web_01_ht_Exceptions;

import java.util.Arrays;

public class ex_03 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3};
        int[] arr2 = {3, 2, 1, 0, 5};
        if (arr1.length != arr2.length) {
            System.out.println("длины массивов не равны");
        } else {
            System.out.println(Arrays.toString(diff(arr1, arr2)));
        }

    }

    public static int[] diff(int[] arr1, int[] arr2) {
        int[] diffs = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            diffs[i] = arr1[i] - arr2[i];
        }
        return diffs;
    }
}
