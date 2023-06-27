package linked_list;

public class DeleteNthNodeFromLast {
    LLNode delete(LLNode head, int n) {
        if (head == null) {
            return null;
        }
        LLNode currentNode = head;
        int size = 0;
        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }
        if(size == n) {
            return head.next;
        }
        int beforeTargetedNode = size - n;
        if(beforeTargetedNode < 0) {
            return null;
        }

        currentNode = head;
        int i = 1;
        while (i < beforeTargetedNode) {
            currentNode = currentNode.next;
            i++;
        }
        currentNode.next = currentNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        BuildLinkedList buildLinkedList = new BuildLinkedList();
        LLNode head = buildLinkedList.addNodeToLast("this");
        head = buildLinkedList.addNodeToLast("is");
        head = buildLinkedList.addNodeToLast("a");
        head = buildLinkedList.addNodeToLast("list");
        System.out.println("Before Delete");
        buildLinkedList.printList(head);
        DeleteNthNodeFromLast deleteNthNodeFromLast = new DeleteNthNodeFromLast();
        head = deleteNthNodeFromLast.delete(head, 4);
        System.out.println("\nAfter Delete");
        buildLinkedList.printList(head);
    }
}
