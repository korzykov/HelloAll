package Strings_3;

//5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита, а среди них – количество слов с равным числом гласных и согласных букв.


import java.util.Scanner;

public class Task5_Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] words = word.split(" ");
        int numberOfEnglishWorlds = 0;
        int numberOfWordsGlasnAndSoglasnEqual = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[a-zA-z]+")) {
                numberOfEnglishWorlds++;
                String[] letters = words[i].split("");
                int countOfGlasn = 0;
                int countOfSoglasn = 0;
                for (int n = 0; n < letters.length; n++) {
                    if (letters[n].matches("[qeyuioa]")) {
                        countOfGlasn++;
                    }
                    if (letters[n].matches("[^qeyuioa]")) {
                        countOfSoglasn++;
                    }
                }
                if (countOfGlasn == countOfSoglasn) {
                    numberOfWordsGlasnAndSoglasnEqual++;
                }
            }
        }
        System.out.println("Из всех слов: " + numberOfEnglishWorlds + " слов, содержут ТОЛЬКО символы латинского алфавита, из них " + numberOfWordsGlasnAndSoglasnEqual + " имеют равное количество гласных и согласных букв");
    }
}

