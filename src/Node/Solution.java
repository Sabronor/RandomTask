package Node;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        while (cur != null && cur.next != null){
            if(cur.value == cur.next.value) cur.next = cur.next.next;
            else cur = cur.next;
        }

        return head;
    }
}
