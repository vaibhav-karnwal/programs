/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null ||  head.next==null)return null;
        ListNode temp = head;
        ListNode fast =head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow=slow.next;
            if(slow==fast){
                while(temp!=slow){
                    temp=temp.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
