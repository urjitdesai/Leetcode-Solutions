/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        Stack<Integer> s=new Stack<>();
        while(head!=null){
            s.push(head.val);
            head=head.next;
        }
        int c=0,sum=0;
        while(!s.isEmpty()){
            int x=s.pop();
            if(x==1){
                sum+=Math.pow(2,c);
            }
            c++;
        }
        return sum;
    }
}
