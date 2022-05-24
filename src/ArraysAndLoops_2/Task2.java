package ArraysAndLoops_2;
// Имеется целое число. Следует посчитать сумму цифр данного числа.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int n = sc.nextInt(); n != 0; n /= 10)
        {
            sum += (n % 10);
        }
        System.out.println(sum + " ");
    }
}
