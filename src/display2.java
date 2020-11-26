public class display2 {

    Node cur = newHead;
        while(cur !=null)

    {
        System.out.print(cur.data + " ");
        cur = cur.next;
    }
        System.out.println();


    public Node middleNode() {
        Node slow = this.head;
        Node fast = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

