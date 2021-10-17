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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)return head;
        ListNode fast = head;
        int count=1;
        while(fast.next!=null){
            fast=fast.next;
            count++;
        }
        fast.next=head;
        k=k%count;
        k=count-k;
        while(k>0){
            fast = fast.next;
            k--;
        }
        head = fast.next;
        fast.next = null;
        return head;
    }
}
