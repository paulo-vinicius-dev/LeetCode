import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
	// usando formula de gauss	
	int n = nums.length;
	int expectedSum = n * (n + 1) / 2;
	int currentSum = 0;
	for (int i = 0; i < n; i++) {
	    currentSum += nums[i];	    
	}
	return expectedSum - currentSum;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr = {0,1};
        
        System.out.println(solution.missingNumber(arr));
    }
}
