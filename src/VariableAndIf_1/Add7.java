package VariableAndIf_1;

//(Дополнительно) В переменную записываете количество программистов. В
//зависимости от количества программистов необходимо вывести правильно
//окончание. Например:
//• 2 программиста
//• 1 программиста
//• 10 программистов
//• и т.д.

import java.util.Scanner;

public class Add7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 10 == 0 || num % 10 == 5 || num % 10 == 6 || num % 10 == 7 || num % 10 == 8 || num % 10 == 9) {
            System.out.println(num + " программистов");
        } else if (num % 10 == 1) {
            System.out.println(num + " программист");
        } else {
            System.out.println(num + " программиста");
        }
    }
}
