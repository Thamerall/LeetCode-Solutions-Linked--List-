public class ReverseNodesK_Group_25 {


    /*

    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode p = head;
        int i = 0;
        while(p != null && i < k) {
            p = p.next;
            i++;
        }
        if(i == k) {
            p = reverseKGroup(p, k);
            while(i-- > 0) {
                ListNode tmp = head.next;
                head.next = p;
                p = head;
                head = tmp;
            }
            head = p;
        }
        return head;
    }
     */
}
