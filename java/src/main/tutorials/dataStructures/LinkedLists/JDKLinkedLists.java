package main.tutorials.dataStructures.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class JDKLinkedLists {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
        Employee billTrump = new Employee("Bill","Trump",1304);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);
        list.add(billTrump);

        System.out.println("HEAD -> ");

        Iterator iter = list.iterator();
        while (iter.hasNext())
        {
            System.out.print(iter.next());
            System.out.println("  <=>");
        }
//        list.forEach(emp -> System.out.println(emp));
        System.out.println(list.contains(mikeWilson));
        System.out.println(list.get(2));
        System.out.println(list.indexOf(billTrump));
        System.out.println(list.lastIndexOf(billTrump));
        list.removeIf(emp -> emp.getId() > 3000);
        System.out.println(list.getFirst());

        list.forEach(emp -> System.out.println(emp));
        list.clear();
        System.out.println(list.size());

    }
}
