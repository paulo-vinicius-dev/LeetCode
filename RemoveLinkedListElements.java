class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
       	ListNode dummy = new ListNode(); 
	ListNode tail = dummy;
	while (head != null) {
	    if (head.val != val) {
		tail.next = head;	
		tail = tail.next;
            }
            head = head.next; 
        }

	tail.next = null;
	return dummy.next;
    }
}

public class RemoveLinkedListElements {
    public static void main(String[] args) {
	Solution solution = new Solution();

	int val = 6;
	ListNode list = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))));

	ListNode result = solution.removeElements(list, val);

	System.out.println("=".repeat(50));
        while (result != null) {
	    System.out.println(result.val);
	    result = result.next;
	}
    }
}
