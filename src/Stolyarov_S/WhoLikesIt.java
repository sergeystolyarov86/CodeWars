package Stolyarov_S;

//You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items.
// We want to create the text that should be displayed next to such an item.
//
//        Implement the function which takes an array containing the names of people that like an item.
//        It must return the display text as shown in the examples:
//
//        []                                -->  "no one likes this"
//        ["Peter"]                         -->  "Peter likes this"
//        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
//        Note: For 4 or more names, the number in "and 2 others" simply increases.

public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Bob","John","Jack","Stan","kjhu"));
    }

    public static String whoLikesIt(String... names) {
        String result = null;
        if (names.length == 0) return "no one likes this";
        for (int i = 0; i < names.length; i++) {
            if (i == 0) result = String.format("%s %s", names[i], "likes this");
            else if (i == 1) result = String.format("%s %s %s %s", names[0],"and", names[1], "like this");
            else if (i == 2) result = String.format("%s, %s %s %s %s", names[0], names[1],"and",names[2], "like this");
            else result = String.format("%s, %s %s %d %s", names[0], names[1], "and",names.length-2,"others like this");
        }
        return result;
    }
}
