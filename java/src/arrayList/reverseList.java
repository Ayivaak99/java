package arrayList;

import java.util.*;

public class reverseList {

    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        int temp;
        for(int i=0; i<list.size()/2; i++) {
            temp = list.get(i);
            list.set(i, list.get(list.size()-i-1));
            list.set(list.size()-i-1, temp);
        }
        return list;
    }

    public static void show(ArrayList<Integer> list) {
        for(int number: list) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(15);
        list.add(63);
        list.add(8);
        list.add(24);

        show(list);

        System.out.println("After reversing:\n");

        show(reverse(list));

    }
}
