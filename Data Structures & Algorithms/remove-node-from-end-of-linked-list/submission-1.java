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
        if(head == null || head.next == null) return null;

        int lenght = 1;
        ListNode currLenght = head.next;

        while(currLenght != null){
            lenght++;
            currLenght = currLenght.next;
        }

        if (lenght == n) return head.next;
        ListNode prev = head;
        ListNode curr = head.next;
        for(int i = 1; i < lenght - n; i++){
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = curr.next;

        return head;
    }
}
