package web_01_ht_Exceptions;

public class ex_01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        System.out.println(divide(a, b));

        int[] arr = {1, 2, 3, 4, 5};
        int index = 8;
//        System.out.println(findValue(arr, index));

        String str = "Hello, world!";
        System.out.println(num(str));
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int findValue (int[] arr, int index) {
        return arr[index];
    }

    public static int num(String str) {
        int number = Integer.parseInt(str);
        return number;
    }
}
