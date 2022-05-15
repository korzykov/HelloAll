package VariableAndIf_1;

//Даны 2 числа. Вывести большее из них.

import java.util.Scanner;

public class Add6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("Числа одинаковые");
        }
    }
}
