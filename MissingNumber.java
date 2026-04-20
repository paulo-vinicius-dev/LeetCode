import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int numLength = nums.length;
        
        for (int i = 0; i < numLength; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return numLength;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr = {0,1};
        
        System.out.println(solution.missingNumber(arr));
    }
}
