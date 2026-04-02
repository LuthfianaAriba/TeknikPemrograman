/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemOne {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("John", 50000));
        list.add(new Employee("Rob", 70000));
        list.add(new Employee("Bob", 40000));
        list.add(new Employee("Alice", 10000));

        List<Employee> sortedEmp = list.stream() // [1]
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName())) // [2][3]
                .collect(Collectors.toList()); // [4][5]

        for(Employee e : sortedEmp){
            System.out.println(e);
        }
    }
}
