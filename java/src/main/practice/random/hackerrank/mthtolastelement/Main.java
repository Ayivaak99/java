package main.practice.random.hackerrank.mthtolastelement;
import java.io.*;
import java.util.*;

public class Main {

    public static int traverse(LinkedList<Integer> list, int len, int index) {
        int number = len - index;
        return list.get(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        while(sc.hasNextInt()) {
            list.add(sc.nextInt());
            System.out.println("Added");
        }

        System.out.println(list);

        int len = list.size();

        if (index > len) {
            System.out.println("NIL");
        }
        else {
            System.out.println(traverse(list, len, index));
        }
    }
}
