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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)return head;

        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;

        ListNode lastsorted = head;
        ListNode curr = head.next;

        while(curr != null){
            if(curr.val >= lastsorted.val){
                lastsorted = curr;
            }else{
                ListNode prev = dummy;
                while(prev.next.val < curr.val){
                    prev = prev.next;
                }
                lastsorted.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            }
            curr = lastsorted.next;
        }
        return dummy.next;

    }
}