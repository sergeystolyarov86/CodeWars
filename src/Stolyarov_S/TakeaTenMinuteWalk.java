package Stolyarov_S;
//You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an
//        appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with
//        a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter
//        strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each
//        letter (direction) and you know it takes you one minute to traverse one city block, so create a function that
//        will return true if the walk the app gives you will take you exactly ten minutes
//        (you don't want to be early or late!) and will, of course, return you to your starting point.
//        Return false otherwise.
//
//        Note: you will always receive a valid array containing a random assortment of direction letters
//        ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).


public class TakeaTenMinuteWalk {
    public static void main(String[] args) {
        char []testCh=new char[] {'n','s','n','s','n','s','n','s','n'};
        System.out.println(isValid(testCh));

    }
    public static boolean isValid(char[] walk) {
        if(walk.length!=10) return false;
        int start=0;
        int n=1;
        int s=-1;
        int w=10;
        int e=-10;
        int nStep=0;
        int sStep=0;
        int wStep=0;
        int eStep=0;
        for (char c : walk) {
            if (c == 'n') nStep++;
            if (c == 's') sStep++;
            if (c == 'e') eStep++;
            if (c == 'w') wStep++;
        }
        return start == nStep * n + sStep * s + wStep * w + eStep * e;
    }
}
