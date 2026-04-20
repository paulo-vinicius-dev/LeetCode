import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int aux = 0;
        while (p2 < nums.length) {
            if (nums[p1] == 0 && nums[p2] != 0) {
                aux = nums[p2];
                nums[p2] = nums[p1];
                nums[p1] = aux;
                p1 += 1;
            } else if (nums[p2] == 0 && nums[p1] != 0) {
                p1 += 1;
            } else {
                p2 += 1;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr = {4,2,4,0,0,3,0,5,1,0};
        // int[] arr = {1, 0, 1};
        // int[] arr = {0,1,0,3,12};
        
        solution.moveZeroes(arr);
        
        System.out.println(Arrays.toString(arr));
    }
}
