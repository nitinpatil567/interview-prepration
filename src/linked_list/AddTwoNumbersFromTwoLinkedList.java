package linked_list;

public class AddTwoNumbersFromTwoLinkedList {
    LLNode add(LLNode node1, LLNode node2) {
        LLNode root = new LLNode(String.valueOf(0));
        LLNode current = root;
        int carry = 0;
        while (node1 != null || node2 != null) {
            int sum = carry;
            if (node1 != null) {
                sum += Integer.parseInt(node1.data);
                node1 = node1.next;
            }
            if (node2 != null) {
                sum += Integer.parseInt(node2.data);
                node2 = node2.next;
            }
            carry = sum / 10;
            current.next = new LLNode(String.valueOf(sum % 10));
            current = current.next;
        }
        if(carry > 0) {
            current.next = new LLNode(String.valueOf(carry));
            current = current.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        AddTwoNumbersFromTwoLinkedList addTwoNumbersFromTwoLinkedList = new AddTwoNumbersFromTwoLinkedList();
        int[] nums1 = {9,9,9,9,9,9,9};
        int[] nums2 = {9,9,9,9};
        BuildLinkedList buildLinkedList = new BuildLinkedList();
        LLNode llNode1 = buildLinkedList.createByArrayNumbers(nums1);
        LLNode llNode2 = buildLinkedList.createByArrayNumbers(nums2);
        buildLinkedList.printList(llNode1);
        System.out.println();
        buildLinkedList.printList(llNode2);
        LLNode sumedNode = addTwoNumbersFromTwoLinkedList.add(llNode1, llNode2);
        System.out.println();
        buildLinkedList.printList(sumedNode);
    }
}
