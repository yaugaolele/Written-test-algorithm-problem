package 笔试代码题;
//判断链表中是否有环
//判断给定的链表中是否有环。如果有环则返回true，否则返回false。

/**
 * 思路：
 * 采用快慢指针
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Test1 {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //1.如果只有一个结点或者是没有结点的时候是没有环的
        if (head == null || head.next == null) {
            return false;
        }
        //2.存在不只有一个结点的情况
        while (fast != null && fast.next != null) {
            //fast走两步
            fast = fast.next.next;
            //slow走一步
            slow = slow.next;
            //进行判断看fast和slow是否相等
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
