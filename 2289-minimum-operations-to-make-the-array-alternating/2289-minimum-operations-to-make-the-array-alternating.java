import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                hm1.put(nums[i], hm1.getOrDefault(nums[i], 0) + 1);
            } else {
                hm2.put(nums[i], hm2.getOrDefault(nums[i], 0) + 1);
            }
        }

        // Find top two max values in both maps
        int max1 = 0, secondMax1 = 0, key1 = -1, secondKey1 = -1;
        for (Map.Entry<Integer, Integer> entry : hm1.entrySet()) {
            int val = entry.getValue();
            if (val > max1) {
                secondMax1 = max1;
                secondKey1 = key1;
                max1 = val;
                key1 = entry.getKey();
            } else if (val > secondMax1) {
                secondMax1 = val;
                secondKey1 = entry.getKey();
            }
        }

        int max2 = 0, secondMax2 = 0, key2 = -1, secondKey2 = -1;
        for (Map.Entry<Integer, Integer> entry : hm2.entrySet()) {
            int val = entry.getValue();
            if (val > max2) {
                secondMax2 = max2;
                secondKey2 = key2;
                max2 = val;
                key2 = entry.getKey();
            } else if (val > secondMax2) {
                secondMax2 = val;
                secondKey2 = entry.getKey();
            }
        }

        // If most frequent keys are different
        if (key1 != key2) {
            return nums.length - (max1 + max2);
        } else {
            // Choose the better alternative
            int option1 = max1 + secondMax2;
            int option2 = max2 + secondMax1;
            return nums.length - Math.max(option1, option2);
        }
    }
}
