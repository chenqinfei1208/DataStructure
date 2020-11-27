public class hasCycle {
    Node fast = this.head;
    Node slow = this.head;
        while(fast !=null&&fast.next !=null)

    {
        fast = fast.next.next;
        slow = slow.next;
        if (slow == fast) {
            return true;
        }
    }
        return false;*/
    Node fast = this.head;
    Node slow = this.head;
        while(fast !=null&&fast.next !=null)

    {
        fast = fast.next.next;
        slow = slow.next;
        if (slow == fast) {
            break;
        }
    }
    //有2种情况
        if(fast ==null||fast.next==null)

    {
        return false;
    }
        return true;


    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        //有2种情况
        if (fast == null || fast.next == null) {
            //没有环
            return null;
        }
        slow = this.head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
