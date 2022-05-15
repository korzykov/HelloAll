package VariableAndIf_1;

//сделать метод-автоконвертер градусов цельсия в форенгейт

import java.util.Scanner;

public class TaskC {
    static double convertCelsiumToFahrenheit(int celsium){
        return (double) celsium*9/5+32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convertCelsiumToFahrenheit(n));

    }
}
