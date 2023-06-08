package web_02_ht_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        enterFloatNum();
    }

    public static void enterFloatNum () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое дробное число: ");
        try {
            float num = scan.nextFloat();
            System.out.println(num);
        } catch (InputMismatchException e) {
            enterFloatNum();
        }
    }
}
