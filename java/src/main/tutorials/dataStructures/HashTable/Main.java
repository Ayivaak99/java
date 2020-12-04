package main.tutorials.dataStructures.HashTable;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 192);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
//        ht.put("End", billEnd);
        System.out.println();

        ht.print();

        System.out.println();
        System.out.println("Retrieve key \"Wilson\" : " + ht.get("Wilson"));
        System.out.println("Retrieve key \"Jones\" : " + ht.get("Jones"));

        System.out.println();
        ht.remove("Wilson");
        ht.remove("Jones");
//        ht.print();

        System.out.println("Retrieve key \"Smith\" : " + ht.get("Smith"));

        System.out.println();
        ht.print();

    }
}
