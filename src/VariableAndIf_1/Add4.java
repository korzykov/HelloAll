package VariableAndIf_1;
//Даны 3 целых числа. Найти количество положительных чисел в исходном
//наборе.


import java.util.Scanner;

public class Add4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int positiveNumbers = 0;
        if (num1 > 0) {
            positiveNumbers++;
        }
        if (num2 > 0) {
            positiveNumbers++;
        }
        if (num3 > 0) {
            positiveNumbers++;
        }
        System.out.println(positiveNumbers);
    }

}
