package Stolyarov_S;

//Your task is to sort a given string.Each word in the string will contain a single number.
//        This number is the position the word should have in the result.
//
//        Note:Numbers can be from 1to 9.So 1will be the first word(not 0).
//
//        If the input string is empty,return an empty string.
//        The words in the input String will only contain valid consecutive numbers.
//                                 Examples
//        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//        ""  -->  ""

public class Order {

    public static String order(String words) {

        if (words == "") return "";
        String[] strings = words.split(" ");
        String[] sortedStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (Character.isDigit(chars[j])) sortedStrings[Character.getNumericValue(chars[j]) - 1] = strings[i];
            }
        }
        String orderString = sortedStrings[0];
        for (int i = 1; i < sortedStrings.length; i++) {
            orderString += " " + sortedStrings[i];
        }

        return orderString;
    }
}
