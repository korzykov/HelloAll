package VariableAndIf_1;

/*Напишите программу которая считывает с клавиатуры  2 целых числа А и B
и выводит через пробел сумму, разность, произведение, частное и остаток от деления
(результат выводит как тип int)
после этого тоже самое только как тип double
*/


import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int iNumber1 = scanner1.nextInt();
        int iNumber2 = scanner2.nextInt();

        int sum = iNumber1 + iNumber2;
        int dif = iNumber1 - iNumber2;
        int mult = iNumber1 * iNumber2;
        int div = iNumber1 / iNumber2;
        int mod = iNumber1 % iNumber2;
        System.out.println(sum + " " + dif + " " + mult + " " + div + " " + mod);

        double dNumber1 = (double) iNumber1;
        double dNumber2 = (double) iNumber2;

        double sum2 = dNumber1 + dNumber2;
        double dif2 = dNumber1 - dNumber2;
        double mult2 = dNumber1 * dNumber2;
        double div2 = dNumber1 / dNumber2;
        double mod2 = dNumber1 % dNumber2;
        System.out.println(sum2 + " " + dif2 + " " + mult2 + " " + div2 + " " + mod2);


    }
}
