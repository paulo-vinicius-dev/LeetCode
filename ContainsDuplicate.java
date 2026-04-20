import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sulution = new Solution();
        
        int[] arr = new int[]{1,1,1,3,3,4,3,2,4,2};
        
        System.out.println(sulution.containsDuplicate(arr));
    }
}
