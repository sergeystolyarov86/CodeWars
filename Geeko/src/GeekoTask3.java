import java.util.*;

public class GeekoTask3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 0);
        System.out.println(closestSum(list, -100));
    }

    public static int closestSum(List<Integer> nums, int target) {

        List<Integer> summList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (i < nums.size() - 2) {
                summList.add(nums.get(i) + nums.get(i + 1) + nums.get(i + 2));
                if (nums.size()==3) return nums.get(i) + nums.get(i + 1) + nums.get(i + 2);
            }
        }
        HashMap<Integer, Integer> stepMap = new HashMap<>();
        int step;
        for (int i = 0; i < summList.size(); i++) {
            if (summList.get(i) < 0 && target >= 0) {
                step = target - summList.get(i);
                stepMap.put(step, summList.get(i));
            }
            if (summList.get(i) < 0 && target < 0 && target > summList.get(i)) {
                step = target - summList.get(i);
                stepMap.put(step, summList.get(i));
            }
            if (summList.get(i) < 0 && target >= 0 && target < summList.get(i)) {
                step = -(target - summList.get(i));
                stepMap.put(step, summList.get(i));
            }

            if (summList.get(i) > 0 && target >= 0 && target > summList.get(i)) {
                step = target - summList.get(i);
                stepMap.put(step, summList.get(i));
            }
            if (summList.get(i) >= 0 && target >= 0 && target < summList.get(i)) {
                step = summList.get(i) - target;
                stepMap.put(step, summList.get(i));
            }
            if (summList.get(i) >= 0 && target >= 0 && target > summList.get(i)) {
                step = target - summList.get(i);
                stepMap.put(step, summList.get(i));
            }
            if(summList.get(i)>0 && target<0) {
                step=summList.get(i)-target;
                stepMap.put(step,summList.get(i));
            }

        }
        List<Integer> sortedStep = new ArrayList<>(stepMap.keySet());

        System.out.println(summList);
        System.out.println(stepMap);

        return stepMap.get(Collections.min(sortedStep));


    }
}


