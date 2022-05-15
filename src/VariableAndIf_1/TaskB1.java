package VariableAndIf_1;

// программа которая вычисляет корни квадратного уравнения через дискриминант


import java.util.Scanner;

public class TaskB1 {
    public static double dis(int a, int b, int c) {
        return (double) b * b - 4 * a * c;
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();
        if (dis(a, b, c) > 0) {
            double x1 = (-b + Math.sqrt(dis(a, b, c))) / (2 * a);
            double x2 = (-b - Math.sqrt(dis(a, b, c))) / (2 * a);
            System.out.println(x1 + " ," + x2);
        }
        if (dis(a, b, c) == 0) {
            double x1 = -b / (2 * a);
            System.out.println(x1);
        }
        if (dis(a, b, c) < 0) {
            System.out.println("Корней нет, отрицательный дискриминант");
        }


    }
}
