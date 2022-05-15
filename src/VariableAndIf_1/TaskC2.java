package VariableAndIf_1;
// метод чтобы вычислять сумму цифр 4х значного числа
// например 5467  = 22

import java.util.Scanner;

public class TaskC2 {
    static int sumNumbers(int number) {
        int num1 = number%10;
        int num2 = (number%100-num1)/10;
        int num3 = (number%1000-num2*10-num1)/100;
        int num4 = (number/1000);
        return (num1+num2+num3+num4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sumNumbers(number));


    }
}
