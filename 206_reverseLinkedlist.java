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
    public ListNode reverseList(ListNode head) {
        ListNode temp =  head; //initialize pointers
        ListNode prev = null; //initialize pointers
        if(head == null){
            head = temp;
        }
        while(temp != null){
            ListNode next = temp.next; // assigned the next node as next pointer(temporalily)
            temp.next = prev; // assigned the prev node as next pointers
            prev = temp; //assigned the prev as temp
            temp = next; //assigned the temp as next
        }
    return prev; 
    }
}
