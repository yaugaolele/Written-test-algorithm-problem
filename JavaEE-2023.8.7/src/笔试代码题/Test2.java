package 笔试代码题;
//反转链表
//给定一个单链表的头结点pHead(该头节点是有值的，比如在下图，它的val是1)，长度为n，反转该链表后，返回新链表的表头。

/**
 * 思路：
 * 采用头插法进行
 */
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) {
        val = x;
        next = null;
    }
}
public class Test2 {
    public ListNode1 ReverseList(ListNode1 head) {
        //1.只有一个结点或者是没有结点的情况下
        if (head == null || head.next == null) {
            return head;
        }
        //2.如果不只是有一个结点
        ListNode1 cur = head.next;//用cur记录一下head的下一个结点的位置
        //3.让头结点断开连接
        head.next = null;
        //4.依次进行循环头插法的方式进行逆置
        while (cur != null) {
            ListNode1 curNext = cur.next;//采用curNext来记录下cur的下一个结点的位置
            //(1)使用头插法将cur插入到head的前面
            cur.next = head;
            //(2)修改头结点的指向
            head = cur;
            //(3)让cur在指向curNext的位置依次进行下一次的循环
            cur = curNext;
        }
        return head;
    }
}
