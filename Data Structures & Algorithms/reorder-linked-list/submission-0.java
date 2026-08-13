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
    public void reorderList(ListNode head) {
       ArrayList<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr);
            curr = curr.next;
        }
        
        int firstHalf = 0;
        int secondHalf = list.size()-1;

        while(firstHalf < secondHalf){
            list.get(firstHalf).next = list.get(secondHalf);
            firstHalf++;
            if(firstHalf >= secondHalf) break;
            list.get(secondHalf).next = list.get(firstHalf);
            secondHalf--;
        }
        list.get(firstHalf).next = null;
    }
}
