package main.tutorials.dataStructures.LinkedLists;

public class IntegerLinkedLists {
    private IntegerNode head;
    private int size;

    public void insertSorted(Integer value) {
        IntegerNode node = new IntegerNode(value);
        if (head == null || value < head.getNumber()) {
            addToFront(value);
            return;
        }
        IntegerNode current = head.getNext();
        IntegerNode prev = head;
        while (current != null && current.getNumber() < value) {
            prev = current;
            current = current.getNext();
        }
        node.setNext(current);
        prev.setNext(node);
        size++;

    }

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        IntegerNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}
