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
            String[] letters = words[i].split("");
            // идея преобразовать каждый элемент в char, через цикл сравнить все чары , чтобы 1 был самый маленький 2 меньше и т.д. и как только есть такой flag на true и через break цикл прекращается. Вывод ответа.     }
        }
    }
}
