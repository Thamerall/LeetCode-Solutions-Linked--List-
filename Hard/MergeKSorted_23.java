public class MergeKSorted_23 {

    // This is a hard problem can be breakig to sub problems ,
    // partition in the list , then we merge the list which is also two differnent questions on leetcode.
    /*

     public ListNode mergeKLists(ListNode[] lists) {
		  return partition(lists, 0, lists.length-1);
	  }
	  private ListNode partition(ListNode[] lists, int l, int r) {
		  if(l==r) {
			  return lists[l];
		  }
		  if(l < r) {
			  int m = (l+r)/2;
			  ListNode node1 = partition(lists, l, m);
			  ListNode node2 = partition(lists, m+1, r);
			  return merge(node1, node2);
		  }
		  return null;
	  }
	  private ListNode merge(ListNode n1, ListNode n2) {
		  if(n1==null) return n2;
		  if(n2==null) return n1;
		  if(n1.val<n2.val) {
			  n1.next = merge(n1.next, n2);
			  return n1;
		  } else {
			  n2.next = merge(n2.next, n1);
			  return n2;
		  }
	  }
     */
}
