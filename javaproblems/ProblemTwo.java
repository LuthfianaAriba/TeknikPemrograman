/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class ProblemTwo {
    public static void main(String[] args){
        List<Student> students = Arrays.asList(
                new Student(101, "Joe"),
                new Student(103, "Zulkifli"),
                new Student(102, "Riza"),
                new Student(104, "Alice"),
                new Student(105, "Joshua")
        );
        
        List<Student> ans = students.stream() // [1]
                .sorted((s1, s2) -> {         // [2]
                    
                    if (s1.getName().equalsIgnoreCase(s2.getName())) {
                        return Integer.compare(s1.getId(), s2.getId()); // [3]
                    } 
                    else {
                        return s1.getName().compareToIgnoreCase(s2.getName()); // [4]
                    }
                })
                .collect(Collectors.toList()); // [5]

        for (Student student : ans) {
            System.out.println(student);
        }
    }
}
