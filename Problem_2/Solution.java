class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        ListNode l = null;
        ListNode head = l;
        while(l1 != null && l2 != null){
            if(l == null) {
                if(l1.val < l2.val){
                    l = new ListNode(l1.val, null);
                    l1 = l1.next;
                }else{
                    l = new ListNode(l2.val, null);
                    l2 = l2.next;
                }
                if(head == null) {
            		head = l;
                }
            }else{
                if(l1.val < l2.val){
                    l.next = new ListNode(l1.val, null);
                    l1 = l1.next;
                }else{
                    l.next = new ListNode(l2.val, null);
                    l2 = l2.next;
                }
                l = l.next;
            }
        }
        ListNode p = null;
        if(l1 != null){
            p = l1;
        }
        else {
            p = l2;
        }
        while(p != null){
            l.next = new ListNode(p.val, null);
            l = l.next;
            p = p.next;
        }
        return head;
    }
}
