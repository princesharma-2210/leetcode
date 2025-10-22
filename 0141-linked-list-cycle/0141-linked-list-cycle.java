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
    public boolean hasCycle(ListNode head) {
        ListNode fir= head;
        ListNode sec= head;
        while(sec!=null && sec.next!=null){
            fir= fir.next;
            sec= sec.next.next;
            if(fir==sec){
                return true;
            }
        }
        return false;
    }
}