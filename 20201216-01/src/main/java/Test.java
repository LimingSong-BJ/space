import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class Test {
    @RequiredArgsConstructor
    public static class Node {
        @NonNull
        private int data;
        private Node next;
    }
    public static boolean ifCycle(Node head){
        Node node1 = head;
        Node node2 = head;
        while (node1.next!=null){
            node1=node1.next;
            node2=node2.next.next;
            if(node1==node2)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node6;
        System.out.println(ifCycle(node1));
    }
}
