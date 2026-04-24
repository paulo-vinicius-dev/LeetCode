class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode headTmp = head;
        while (headTmp != null) {
            size += 1;
            headTmp = headTmp.next;
        }

        for (int i = 0; i < size / 2; i++) {
            head = head.next;
        }
        
        return head;
    }
}

class Main {
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        ListNode result = solution.middleNode(list);
        
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
