// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class CyclicLinkedList {


 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        boolean isCyclic = false;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCyclic = true;
                break;
            }
        }
       
        ListNode temp = head;
        if (isCyclic){
            while (temp != slow){
                slow = slow.next;
                temp = temp.next;
            }
            return slow;
        }
        return null;
    }
}
    

