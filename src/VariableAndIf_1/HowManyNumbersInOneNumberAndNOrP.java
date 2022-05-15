package VariableAndIf_1;

//1) В переменную записываем число. Надо вывести на экран сколько в этом
//числе цифр и положительное оно или отрицательное. Например, "это
//однозначное положительное число". Достаточно будет определить, является ли
//число однозначным, "двухзначным или трехзначным.

import java.util.Scanner;

public class HowManyNumbersInOneNumberAndNOrP {

    public static final String oneNumber = "Число является однозначным";
    public static final String twoNumber = "Число является двузначным";
    public static final String threeNumber = "Число является трёхзначным";

    public static void main(String[] args) {
        System.out.println("Введите любое чисто от -999 до 999");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Число является положительным");
            if (number / 10 < 1) {
                System.out.println(oneNumber);
            }
            if (number / 10 >= 1 && number / 10 < 10) {
                System.out.println(twoNumber);
            }
            if (number / 10 >= 10 && number / 10 < 100) {
                System.out.println(threeNumber);
            }

        }
        if (number == 0) {
            System.out.println("Число является ни положительным ни отрицательным");
            System.out.println(oneNumber);

        }
        if (number < 0) {
            System.out.println("Число является отрицательным");
            number = number * (-1);
            if (number / 10 <= 1) {
                System.out.println(oneNumber);
            }
            if (number / 10 >= 1 && number / 10 < 10) {
                System.out.println(twoNumber);
            }
            if (number / 10 >= 10 && number / 10 < 100) {
                System.out.println(threeNumber);
            }

        }


    }
}
