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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp= head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==n){
            head=head.next;
            return head;
        }
        int move= size-n-1;
        int len=0;
        ListNode dummy= head;
        
        while(move!=len){
            len++;
            dummy=dummy.next;
        }
        dummy.next= dummy.next.next;
        return head;
    }
}