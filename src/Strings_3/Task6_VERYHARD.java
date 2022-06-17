package Strings_3;

//6. Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов. Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Task6_VERYHARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] words = word.split(" ");
        boolean flag = false;
        for (int i = 0; i < words.length; i++) {
            char[] charLetters = words[i].toCharArray();
            int[] charToInt = new int[charLetters.length];
            for (int n = 0; n < charLetters.length; n++) {
                charToInt[n] = charLetters[n];
            }
            for (int g = 0; g < charToInt.length; g++) {
                for (int j = g + 1; j < charToInt.length; j++) {
                    if (charToInt[g] < charToInt[j]) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }

                }
                if (flag == false) {
                    break;
                }
            }
            if (flag == true) {
                System.out.println(words[i] + " - слово, символы в котором идут в стро-гом порядке возрастания их кодов ");
                break;
            }
        }
        if (flag == false) {
            System.out.println("Слова с символами, идущими в строгом порядке возрастания их кодов НЕТ");
        }
    }
}
