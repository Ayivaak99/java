package main.java.tutorials.dataStructures.Stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void print() {
        ListIterator<Employee> iter = stack.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
