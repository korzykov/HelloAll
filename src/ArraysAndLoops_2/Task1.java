package ArraysAndLoops_2;

//Имеется целое число, следует вывести его в бухгалтерском формате.
//Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
//20023143 должно быть выведено как 20 023 143

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        DecimalFormat dF = new DecimalFormat("#,###,###,###");
        System.out.print(dF.format(num));

    }
}
