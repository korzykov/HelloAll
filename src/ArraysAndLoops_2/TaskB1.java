package ArraysAndLoops_2;

//1. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        System.out.println("Введите число и получите факториал этого числа");
        Scanner sc = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#,###,###,###");
        int num = sc.nextInt();
        long factorialNum = 1;
        if (num == 0) {
            System.out.println("0");
        }
        for (int i = 1; i <= num; i++) {
            factorialNum *= i;
            System.out.println(dF.format(factorialNum));
        }

    }


}