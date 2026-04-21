import java.util.Stack;

class Solution {
    public String generateWithoutBackspace(String s) {
        Stack<Character> chars = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                chars.push(s.charAt(i));
            } else if (!chars.isEmpty()) {
                chars.pop();
            }
        }
        
        return String.valueOf(chars);
    }
    
    public boolean backspaceCompare(String s, String t) {
        return generateWithoutBackspace(s).equals(generateWithoutBackspace(t));
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s = "ab#c";
        String t = "ad#c";
        
        System.out.println(solution.backspaceCompare(s, t));
    }
}
