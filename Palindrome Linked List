/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow= head;
        Stack<Integer>st = new Stack();
        while(fast.next!=null && fast.next.next!=null){
            st.push(slow.val);
            fast= fast.next.next;
            slow = slow.next;
        }
        if(fast.next!=null){
            st.push(slow.val);
        }
        slow = slow.next;
        
        while(slow!=null){
            if(slow.val!=st.pop()){
                return false;
            }
            slow=slow.next;
        }
        return true;
    }
}
