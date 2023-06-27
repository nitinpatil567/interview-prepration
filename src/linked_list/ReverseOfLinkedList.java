package linked_list;

public class ReverseOfLinkedList {
    public LLNode reverseByRecursion(LLNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        LLNode newNodeHead = reverseByRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNodeHead;
    }

    public LLNode reverseByIteration(LLNode head) {
        if (head == null || head.next == null) {
            System.out.println("Empty Linked List or only one element is defined!");
            return null;
        }

        LLNode previousNode = head;
        LLNode currentNode = head.next;

        while (currentNode != null) {
            LLNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            //Update node values
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = previousNode;
        return head;
    }

    public static void main(String[] args) {
        ReverseOfLinkedList reverseOfLinkedList = new ReverseOfLinkedList();
        LLNode head;

        BuildLinkedList buildLinkedList = new BuildLinkedList();
        head = buildLinkedList.addNodeToLast("this");
        head = buildLinkedList.addNodeToLast("is");
        head = buildLinkedList.addNodeToLast("a");
        head = buildLinkedList.addNodeToLast("list");
        buildLinkedList.printList(head);
//        head = reverseOfLinkedList.reverseByIteration(head);
        head = reverseOfLinkedList.reverseByRecursion(head);
        System.out.println();
        buildLinkedList.printList(head);
    }
}
