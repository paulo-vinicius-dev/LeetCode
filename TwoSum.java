import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(target - nums[i], i);
        }
        
        for (int i =  0; i < nums.length; i++) {
            if (numsMap.get(nums[i]) != null && numsMap.get(nums[i]) != i) {
                return new int[] {i, numsMap.get(nums[i])};
            }
        }
        return new int[] {};
    }
}

class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr = new int[] {3, 3};
        
        System.out.println(Arrays.toString(solution.twoSum(arr, 6)));
    }
}
