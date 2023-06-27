package linked_list;

public class BuildLinkedList {
    LLNode head;

    //Add node to start of the list
    public LLNode addNodeToHead(String data) {
        LLNode newNode = new LLNode(data);
        if(head == null) {
            head = newNode;
            return head;
        }

        newNode.next = head;
        head = newNode;
        return head;
    }

    //Add node to last of the list
    public LLNode addNodeToLast(String data) {
        LLNode newNode = new LLNode(data);
        if(head == null) {
            head = newNode;
            return head;
        }

        LLNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        return head;
    }

    //Print all list
    public void printList(LLNode head) {
        if(head == null) {
            System.out.println("List is empty!");
            return;
        }
        LLNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data+ " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("NULL");
    }

    public LLNode createByArrayNumbers(int nums[]) {
        LLNode root = new LLNode(String.valueOf(0));
        LLNode current = root;
        for(int i = 0; i<nums.length;i++) {
            LLNode node = new LLNode(String.valueOf(nums[i]));
            current.next = node;
            current = current.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        BuildLinkedList linkedList = new BuildLinkedList();
        LLNode root;
        root = linkedList.addNodeToHead("Digambar");
        root = linkedList.addNodeToHead("is");
        root = linkedList.addNodeToHead("name");
        root = linkedList.addNodeToHead("My");
        root = linkedList.addNodeToLast("Patil");
        linkedList.printList(root);
    }
}
