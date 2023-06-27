package linked_list;

import java.util.LinkedList;

public class DeleteLinkedList {

    //Delete from Head
    public LLNode deleteByStart(LLNode head) {
        if(head == null) {
            System.out.println("Nothing to delete");
            return null;
        }

        head = head.next;
        return head;
    }

    public LLNode deleteByEnd(LLNode head) {
        if(head == null) {
            System.out.println("Nothing to delete");
            return null;
        }
        if(head.next == null) {
            head = null;
            return null;
        }
        LLNode secondLastNode = head;
        LLNode lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null;

        return head;
    }

    public static void main(String[] args) {
        DeleteLinkedList deleteLinkedList = new DeleteLinkedList();
        BuildLinkedList linkedList = new BuildLinkedList();
        LLNode head;
        head = linkedList.addNodeToHead("list");
        head = linkedList.addNodeToHead("a");
        head = linkedList.addNodeToHead("is");
        head = linkedList.addNodeToHead("this");
//        head = deleteLinkedList.deleteByStart(head);
//        head = deleteLinkedList.deleteByEnd(head);
        LLNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }
}
