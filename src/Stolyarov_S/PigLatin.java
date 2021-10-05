package Stolyarov_S;

//  Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks
//   untouched.
//
//        Examples
//        pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//        pigIt('Hello world !');     // elloHay orldway !

import java.util.ArrayList;

import java.util.Collections;


public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }

    public static String pigIt(String str) {
        String result = "";
        String[] words = str.split(" ");
        int countWords = words.length;
        for (String word : words) {
            ArrayList<Character> characters = new ArrayList<>();
            for (char c : word.toCharArray()) {
                characters.add(c);
            }
            if (characters.size() > 1) {
                char ch;
                ch = characters.get(0);
                characters.remove(0);
                characters.add(ch);
                Collections.addAll(characters, 'a', 'y');
                for (int i = 0; i < characters.size(); i++) {
                    result += characters.get(i);
                }
                countWords--;
                if (countWords > 0) result += " ";
            }
            if (characters.size() == 1) {
                result += characters.get(0);
            }
        }
        return result;
    }
}

