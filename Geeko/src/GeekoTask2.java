
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeekoTask2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 51, 48, 62);
        System.out.println(getResult(list, 11));
    }

    public static int getResult(List<Integer> cash, int s) {
        int count = 0;
        while (s != 0) {
            int min = Collections.min(cash);
            for (int i = 0; i < cash.size(); i++) {
                if (cash.get(i) == min && s >= 3) {
                    cash.set(i, min + 3);
                    s = s - 3;
                } else if (s < 3) {
                    if(cash.get(i)==min) cash.set(i, min + s);
                    s = 0;
                }
            }
        }

        int max = Collections.max(cash);
        System.out.println(cash);
        for (Integer i : cash) {
            if (i < max) count++;
        }
        return count;
    }
}


