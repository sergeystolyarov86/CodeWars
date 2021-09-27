package Stolyarov_S;

// программа проверяет является ли строка полиндромом

public class IsPolindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

    public static boolean isPalindrome(String text) {
        String text2 = text.replaceAll("[^a-zA-Z0-9]+", "");
        char[] chars = text2.toLowerCase().toCharArray();
        int count = 0;
        int halfArr = chars.length / 2;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[chars.length - (i + 1)] && i < halfArr) count++;
        }
        if (count == halfArr) return true;
        return false;
    }

}
