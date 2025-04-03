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

//O(n^2) brute force

class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null) return null;

        ListNode current  = head;

        while(current != null){
            ListNode temp = current;
            ListNode min = temp;

            while(temp != null){
                if(temp.val < min.val){
                    min = temp;
                }
                temp = temp.next;
            }
            int swap = current.val;
            current.val = min.val;
            min.val = swap;
            current = current.next;


        }
        return head;
    }
}

//Solution using merge Sort 

class Solution {
    public ListNode sortList(ListNode head) {
        // Base case: If the list is empty or has only one node, it's already sorted
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split the list into two halves
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Cut the list into two halves
        prev.next = null;

        // Step 2: Recursively sort both halves
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // Step 3: Merge the sorted halves
        return mergeLists(l1, l2);
    }

    // Merge two sorted linked lists
    private ListNode mergeLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Merge the two lists
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in either l1 or l2, append them
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }
}
