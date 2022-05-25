package ArraysAndLoops_2;

//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое натуральное число");
        int naturalNum = sc.nextInt();
        if (naturalNum <= 0) {
            System.out.println("Вы ввели ненатуральное число");
        }
        for (int i = 1; i <= naturalNum; i++) {
            if (naturalNum % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
