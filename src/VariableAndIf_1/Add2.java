package VariableAndIf_1;

//существует ли такой треугольник. Сумма 2-х сторон должна быть больше 3-й стороны


import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        int sum1and2 = side1 + side2;
        int sum1and3 = side1 + side3;
        int sum2and3 = side3 + side2;

        if (sum1and2 <= side3 || sum2and3 <= side1 || sum1and3 <= side2) {
            System.out.println("Такого треугольника не существует");
        } else {
            System.out.println("Существует!");


        }
    }
}
