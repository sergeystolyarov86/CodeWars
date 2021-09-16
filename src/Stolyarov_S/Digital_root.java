package Stolyarov_S;
//Given n, take the sum of the digits of n. If that value has more than one digit,
//  continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
//     Example:
//     16  -->  1 + 6 = 7
//     942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
//    132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6

public class Digital_root {
    public static void main(String[] args) {
        System.out.println(Digital_root.digital_root(12345));

    }

    public static int digital_root(int n) {

        if (n < 10) return n;
        else {
            String num = String.valueOf(n);
            char[] ch = num.toCharArray();
            n = 0;

            for (int i = 0; i < ch.length; i++) {
                n += Character.getNumericValue(ch[i]);
                if (n > 9) {
                    char[] ch1 = String.valueOf(n).toCharArray();
                    n = 0;
                    for (int j = 0; j < ch1.length; j++) {
                        n += Character.getNumericValue(ch1[j]);
                    }
                }

            }
            return n;
        }
    }
}


