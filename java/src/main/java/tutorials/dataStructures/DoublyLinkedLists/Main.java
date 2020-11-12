package main.java.tutorials.dataStructures.DoublyLinkedLists;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        Employee billFumes = new Employee("Bill", "Fumes", 309);
        list.addToEnd(billFumes);
        System.out.println(list.getSize());
        list.printList();
//        System.out.println(list.isEmpty());

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();
        
    }
}
