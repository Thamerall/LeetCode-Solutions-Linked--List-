public class PalindromeLL_234 {
}


/*

    public boolean isPalindrome(ListNode head) {
        Stack stack = new Stack();
        ListNode curr = head;
        while(curr != null){
            stack.push(curr.val);
            curr = curr.next;
        }
        while(head != null){
            if(head.val != (int)stack.pop()){
                return false;
            }
            head = head.next;

        }
        return true;
    }

    */