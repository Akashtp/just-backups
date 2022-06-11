import java.util.*;
import java.io.*;

class Kodane {

    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };

        System.out.println("The maximum sub array:" + subarray(nums));
    }

    static int subarray(int[] nums) {
        int curr = 0;
        int m = Integer.MIN_VALUE;

        for (int num : nums) {
            curr = Math.max(curr + num, num);
            m = Math.max(m, curr);
        }
        return m;
    }

}