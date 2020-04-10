//This is not the optimum solution, a better solution would be to take two temporary nodes and move one node by 1 and other node by 2
//in this way when second node reaches the end, the first node is the middle node. Try it yourself.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        int mid=0;
        
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        mid=(count/2)+1;
        System.out.println(mid);
        
        temp=head;
        count=1;
        while(count!=mid)
        {
            temp=temp.next;
            count++;
        }
        head=temp;
        return head;
        
    }
}
