package Strings_3;

public class TestMatches {
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "Русский язык";
        String word3 = "a";
        System.out.println(word1.matches("[a-zA-Z]+"));
        System.out.println(word2.matches("[a-я А-Я]+"));
        System.out.println(word3.matches("[qeyuioa]"));
    }
}
