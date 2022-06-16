package Strings_3;

import java.util.Scanner;

//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк, которые собираетесь ввести");
        Scanner sc = new Scanner(System.in);
        int numStrings = Integer.parseInt(sc.nextLine());
        String[] strings = new String[numStrings];
        int maxString = 0;
        int minString = 0;
        for (int n = 0; n < strings.length; n++) {
            strings[n] = sc.nextLine();
            if (strings[n].length() > maxString) {
                maxString = strings[n].length();
            }
        }
        for (int n = 0; n < strings.length; n++) {
            if (minString == 0 || strings[n].length() < minString) {
                minString = strings[n].length();
            }
        }
        for (int n = 0; n < strings.length; n++) {
            if (strings[n].length() == maxString) {
                System.out.println("Самая длинная строка: " + strings[n] + " (содержит " + maxString + " символов с учётом пробелов)");
            }
            if (strings[n].length() == minString) {
                System.out.println("Самая короткая строка: " + strings[n] + " (содержит " + minString + " символов с учётом пробелов)");
            }
        }

    }
}
