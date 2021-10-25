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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        ListNode pre=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int j=0;
        int[] arr=new int[count];
        int[] arr1=new int[count];
        while(pre!=null){
            arr[j]=pre.val;
            arr1[j]=pre.val;
            pre=pre.next;
            j++;
        }
        int max=arr[arr.length-1];
        List<Integer>list=new ArrayList<>();
        for(int i=arr1.length-2;i>=0;i--){
            if(arr1[i]<arr1[i+1]){
               max=arr1[i+1];
               list.add(max);
            }
            int k=1;
            while((k<=list.size())&&arr[i]>=max){
                max=list.get(list.size()-k);
                k++;
            }
            arr[i]=Math.max(arr[i],max);
            if(arr[i]==arr1[i]){
                arr[i]=0;
            }
        }
        arr[arr.length-1]=0;
        return arr;
    }
}














