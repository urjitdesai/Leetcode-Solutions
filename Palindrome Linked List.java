/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        while(!stack.isEmpty()){
            if(stack.pop().val!=temp.val){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
    
}
