package Strings_3;

//4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        String[] strings = words.split(" ");
        String minWorld = null;
        for (int i = 0; i < strings.length; i++) {
            if (minWorld == null || minWorld.length() > strings[i].length()) {
                minWorld = strings[i];
            }
        }
        System.out.println("Слово с минимальным количеством символов: " + minWorld);

    }
}
