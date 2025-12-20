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
        if(head == null || head.next == null || k ==0){
            return head;
        }
        ListNode curr = head;
        int n = 1;
        while(curr.next != null){
            curr = curr.next;
            n++;
        }
        ListNode tail = curr;

        k = k%n;
        if(k==0)return head;

        tail.next = head;

        int newTail = n-k-1;
        curr = head;
        for(int i = 0;i<newTail;i++){
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}