package main.tutorials.dataStructures.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("McMiller", "John", 1006));
        emp.add(new Employee("Benjamin", "Burns", 1032));
        emp.add(new Employee("Robert", "Dawson", 1067));
        emp.add(new Employee("Gloria", "Hawkins", 1024));

//        emp.forEach(employee -> System.out.println(employee));

//        System.out.println(emp.get(3));

//        System.out.println(emp.isEmpty());

        emp.set(1, new Employee("Benjamin", "Gerut", 1032));
        emp.forEach(employee -> System.out.println(employee));

        System.out.println(emp.size());

        emp.add(3, new Employee("Hannah", "Corey", 1048));
        System.out.println(emp.size());
        emp.forEach(employee -> System.out.println(employee));


        Employee[] empArray = emp.toArray(new Employee[emp.size()]);
        for (Employee e: empArray) {
            System.out.println(e);
        }

        System.out.println(emp.contains(new Employee("McMiller","John",1006)));
        System.out.println(emp.indexOf(new Employee("Robert","Dawson",1067)));

        emp.remove(3);
        emp.forEach(employee -> System.out.println(employee));

    }
}

