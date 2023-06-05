package web_01_ht_Exceptions;

import java.util.Arrays;

public class ex_04 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3};
        int[] arr2 = {3, 2, 1, 1, 1};
        System.out.println(Arrays.toString(ratio(arr1, arr2)));
    }

    public static int[] ratio(int[] arr1, int[] arr2) {
        int[] ratios = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("длины массивов не равны");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("на ноль делить нельзя");
                } else {
                    ratios[i] = arr1[i] / arr2[i];
                }
            }
        }
        return ratios;
    }
}
