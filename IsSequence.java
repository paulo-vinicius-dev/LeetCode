// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) {
            return true;
        }
        
        int lettersFound = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(lettersFound)) {
                lettersFound += 1;
            }
            
            if (lettersFound == s.length()) {
                return true;
            }
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s = "bca";
        String t = "bbbbhcccgda";
        
        System.out.println(solution.isSubsequence(s, t));
    }
}
