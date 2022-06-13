import java.util.*;
import java.io.*;

public class TwoSum {
    static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer requiredNum = (Integer) (target - nums[i]);
            if (indexMap.containsKey(requiredNum)) {
                int[] toReturn = { indexMap.get(requiredNum), i };
                return toReturn;
            }
            indexMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 2, 13, 11 };
        int target = 9;
        int[] toprint = findTwoSum(nums, target);
        for(int i = 0; i < toprint.length; i++){
            System.out.println(toprint[i]);
        }
    }
}
