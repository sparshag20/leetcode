/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> s1=new HashSet<>();
        while(head!=null){
            if(s1.contains(head)){
                return true;
            }
            s1.add(head);
            head=head.next;
        }
        return false;
    }
}