public class ReverseLL_206 {
}

// The key.  create a pointer to the tail
/*
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev ;
            prev = head ;
            head = next;
        }
        return prev;
    }
*/