package ArraysAndLoops_2;

//Имеется целое число, определить является ли это число простым,
//т.е. делится без остатка только на 1 и себя.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
                System.out.println("Число составное");
                break;
            }
        }
        if (flag == false) {
            System.out.println("Число простое");
        }
    }

}
