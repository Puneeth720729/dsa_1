class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||(head.next==null&&n==1)){
            return null;
        }
        int length = 0;
        ListNode current = head;
        while(current!=null){
            length++;
            current = current.next;
        }
        ListNode temp = head;
        int ans = length-n;
        if(ans==0){
            return head.next;
        }
        for(int i=0;i<ans-1;i++){
            temp=temp.next;

        }
        if(temp!=null&&temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;
        
    }
}
