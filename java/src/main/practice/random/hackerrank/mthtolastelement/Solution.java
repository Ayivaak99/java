package main.practice.random.hackerrank.mthtolastelement;

// A bruteforce solution to the problem in class Main

import org.junit.runners.Parameterized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public class Node {
        int data;
        Node next;
        Node previous;

        public Node(int item) {
            this.data = item;
        }
    }

    Node head = null;
    Node tail = null;
    private int size;

    public void add(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = tail = node;
            head.previous = null;
        }
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        tail.next = null;
        size++;
    }

    public void print() {
        Node current = head;
        if (head == null) {
            System.out.println("EMPTY");
        }
        else {
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public int traverse(int index) {
        int actual = getSize() - index;
        Node current = head;
        for (int i=0; i<actual; i++) {
            current = current.next;
        }
        return current.data;
    }

    public static void main(String[] args) throws IOException {
        Solution list = new Solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        for(String str : numbers) {
            list.add(Integer.parseInt(str));
        }

//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNextInt()) {
//            list.add(sc.nextInt());
//        }

        if (list.getSize() < index) {
            System.out.println("NIL");
        }
        else {
            System.out.println(list.traverse(index));
        }

//        System.out.println(list.getSize());
    }
}
