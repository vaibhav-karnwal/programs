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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode temp=list1;
        int count=1;
        while(l1.val!=a-1){
            l1=l1.next;
            temp=temp.next;
            count++;
        }
        while(l1.val!=b){
            l1=l1.next;
            count++;
        }
        l1=l1.next;
        while(l2!=null){
            temp.next=l2;
            l2=l2.next;
            temp=temp.next;
        }
        if(l1!=null){
            temp.next=l1;
        }
        return list1;
    }
}
		
