// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/**
 * Definition for singly-linked list.
**/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = previous;
            previous = current;
            current = nextTemp;
        }
        return previous;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        
        ListNode newList = solution.reverseList(list);
        
        while (newList != null) {
            System.out.println(newList.val + " -> ");
            newList = newList.next;
        }
        System.out.println("NULL");
    }
}
