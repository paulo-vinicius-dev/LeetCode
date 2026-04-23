// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        int maxSum = currentSum;
        
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        return (double) maxSum / k;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
    
        System.out.println(solution.findMaxAverage(arr, k));
    }
}
