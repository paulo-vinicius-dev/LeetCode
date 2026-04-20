import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        List<Integer> disappeared = new ArrayList<>();
        
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                disappeared.add(i);
            }
        }
        
        return disappeared;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr = {1,1,1};
        
        System.out.println(solution.findDisappearedNumbers(arr));
    }
}
