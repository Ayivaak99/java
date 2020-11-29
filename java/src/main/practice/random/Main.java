package main.practice.random;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    static Iterator func(ArrayList list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object element  = it.next();
            if (element.equals("###"))
                break;
        }
        return it;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(42);
        list.add(10);
        list.add("###");
        list.add("Hello");
        list.add("Java");

        Iterator it = func(list);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
