/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.datatypes;

import java.util.Scanner;
import java.math.BigInteger;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // jumlah test case

        for (int i = 0; i < T; i++) {
            BigInteger n = new BigInteger(sc.next());

            boolean canFit = false;

            System.out.println(n + " can be fitted in:");

            if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                System.out.println("* byte");
                canFit = true;
            }

            if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                System.out.println("* short");
                canFit = true;
            }

            if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                System.out.println("* int");
                canFit = true;
            }

            if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println("* long");
                canFit = true;
            }
        }
    }
}