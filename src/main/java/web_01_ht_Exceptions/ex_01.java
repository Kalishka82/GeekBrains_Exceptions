package web_01_ht_Exceptions;

public class ex_01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        System.out.println(divide(a, b));

        int[] arr = {1, 2, 3};
        int min_length = 6;
//        if (! checkArrayLength(arr, min_length)) {
//            System.out.println("Длина заданного массива меньше минимальной");
//        }

        int[][] matrix = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}};
        System.out.println(sumSquareMatrix(matrix));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }
        return a / b;
    }

    public static boolean checkArrayLength(int[] arr, int min_length) {
        if (arr.length < min_length) {
            return false;
        }
        return true;
    }

    public static int sumSquareMatrix(int[][] matrix) {
        int sum = 0;
        if (matrix.length != matrix[1].length) {
            return -1;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
