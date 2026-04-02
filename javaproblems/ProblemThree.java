/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproblems;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class ProblemThree {
    public static void main(String[] args) {
        
        int arr[] = {12, 4, 3, 1, 9, 657};
        int n = 3; //terbesar ke-3
        
        int ans = Arrays.stream(arr) // [1]
                .boxed() // [2]
                .sorted((a, b) -> Integer.compare(b, a)) // descending
                .skip(n - 1) // [3]
                .findFirst() // [4]
                .orElse(0); // [5]
        
        System.out.println("Elemen terbesar ke-3 adalah: " + ans);
                
    }
}
