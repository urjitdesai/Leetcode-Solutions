/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
    ListNode helper = new ListNode(0);
    helper.next = head;
    ListNode p = helper;
 
    while(p.next != null){
        if(p.next.val == val){
            //ListNode next = p.next;
            p.next = p.next.next; 
        }else{
            p = p.next;
        }
    }
 
    return helper.next;
    }
        
    }
