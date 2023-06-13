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
        List<ListNode> l1=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            l1.add(temp);
            temp=temp.next;
        }
        ListNode head1=head;
        int k=l1.size();
        for(int i=1;i<=k/2;i++){
            head1.next=l1.get(k-i);
            head1=head1.next;
            head1.next=l1.get(i);
            head1=head1.next;
        }
        head1.next=null;
    }
}