package Strings_3;

import java.util.Scanner;

//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberString = Integer.parseInt(sc.nextLine());
        String[] strings = new String[numberString];
        for (int i = 0; i < numberString; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < numberString; i++) {
            for (int n = i + 1; n < numberString; n++) {
                if (strings[i].length() > strings[n].length()) { // поменять знак на противоположный и будет по убыванию
                    String ok = strings[n];
                    strings[n] = strings[i];
                    strings[i] = ok;

                }
            }
        }
        for (int i = 0; i < numberString; i++) {
            System.out.println(strings[i] + " ,количество символов: " + strings[i].length());
        }
    }
}
