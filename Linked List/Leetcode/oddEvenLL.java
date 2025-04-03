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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode prev = head;
        ListNode current = head.next;
        ListNode temp = current;

        int i = 0;

        while(current != null && current.next != null){
            i++;
            prev.next = current.next;
            prev = current;
            current = current.next;

        }

        if(i%2==1){
            current.next = temp;
            prev.next = null;

        }
        else{
            prev.next = temp;
        }
        return head;

    }
}
