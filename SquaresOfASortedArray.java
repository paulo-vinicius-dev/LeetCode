import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(squares);
        
        return squares;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr = {-4,-1,0,3,10};
        
        System.out.println(Arrays.toString(solution.sortedSquares(arr)));
    }
}
