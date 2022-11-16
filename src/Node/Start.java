package Node;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))))));

        solution.deleteDuplicates(head);

        ListNode cur = head;
        while (cur != null){
            System.out.print(" " + cur.value);
            cur = cur.next;
        }
    }
}
