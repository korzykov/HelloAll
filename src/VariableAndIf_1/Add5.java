package VariableAndIf_1;

//Даны 3 целых числа. Найти количество положительных и отрицательных
//чисел в исходном наборе.


import java.util.Scanner;

public class Add5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        if (num1 > 0) {
            positiveNumbers++;
        } else if (num1 <0){
            negativeNumbers++;
        }
        if (num2 > 0) {
            positiveNumbers++;
        }else if (num2 <0){
            negativeNumbers++;
        }
        if (num3 > 0) {
            positiveNumbers++;
        }else if (num3 <0){
            negativeNumbers++;
        }
        System.out.println("Положительных чисел: " + positiveNumbers +" " + "Отрицательный чисел: " + negativeNumbers);

    }
}
