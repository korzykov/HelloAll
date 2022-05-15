package VariableAndIf_1;

// Дано целое число. Если оно является положительным, то прибавить к нему 1.
//Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
//10. Вывести полученное число.

import java.util.Scanner;

public class Add3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(++number);
        }
        if (number < 0) {
            System.out.println(number -= 2);
        }
        if (number == 0) {
            number = 10;
            System.out.println(number);
        }
    }
}
