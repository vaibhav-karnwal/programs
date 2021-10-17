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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode curr = temp;
        ListNode nex = temp;
        ListNode pre = temp;
        int count=0;
        while(curr.next!=null){
            curr = curr.next;
            count++;
        }
        
        while(count>=k){
            curr = pre.next;
            nex = curr.next;
            for(int i=1;i<k;i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            count-=k;
        }
        return temp.next;
    }
}
