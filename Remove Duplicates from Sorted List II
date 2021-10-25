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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res =new ListNode();
        res.next = head;
        ListNode temp = res;
        
        
        while(head!=null){
            if(head.next!=null && head.val == head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head = head.next;
                }
                temp.next = head.next;
            }else{
                temp = temp.next;
            }
            head = head.next;
        }
        
        return res.next;
    }
}
