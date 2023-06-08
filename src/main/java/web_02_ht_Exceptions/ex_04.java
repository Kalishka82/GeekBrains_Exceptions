package web_02_ht_Exceptions;

import java.util.Objects;
import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        enterAnyString();
    }

    public static void enterAnyString () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любую строку: ");
        String str = scan.nextLine();
        if (Objects.equals(str, "")) {
            System.out.println("Пустые строки вводить нельзя!");
            enterAnyString();
        }
    }
}
