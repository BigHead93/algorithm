package code;

public class lc02 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum, v1, v2;
        int flag = 0;
        ListNode head, tail;
        head = new ListNode(0);
        tail = head;
        while(l1 != null || l2 != null){
            v1 = l1 == null ? 0 : l1.val;
            v2 = l2 == null ? 0 : l2.val;
            sum = v1 + v2 + flag;
            if(sum > 9){
                sum = sum % 10;
                flag = 1;
            }else{
                flag = 0;
            }
            tail.next = new ListNode(sum);
            tail = tail.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if(flag == 1){
            tail.next = new ListNode(1);
        }
        return head.next;
    }
}