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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0; i<lists.length; i++){
            ListNode root= lists[i];
             while(root!=null){
                al.add(root.val);
                root= root.next;
             }
        }
        Collections.sort(al);
        ListNode temp= new ListNode(0);
        ListNode node= temp;
        for(int i=0; i<al.size(); i++){
            node.next= new ListNode(al.get(i));
            node= node.next;
        }
        return temp.next;
    }
}