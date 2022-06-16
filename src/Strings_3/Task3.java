package Strings_3;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberString = Integer.parseInt(sc.nextLine());
        String[] strings = new String[numberString];
        for (int i = 0; i < numberString; i++) {
            strings[i] = sc.nextLine();
        }
        int sumValueString = 0;
        for (int i = 0; i < numberString; i++) {
            sumValueString += strings[i].length();
        }
        int avgValueString = sumValueString / numberString;
        for (int i = 0; i < numberString; i++) {
            if (strings[i].length() > avgValueString) {
                System.out.println(strings[i] + " ,длина строки: " + strings[i].length());
            }
        }
    }
}

