/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operatorchallenge;

/**
 *
 * @author ASUS
 */
public class OperatorChallenge {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        boolean result = (++a * 2 > b) && (b++ % 3 == 1);
        
        System.out.println("Hasil Boolean;"+result);
        System.out.println("Nilai a:"+a);
        System.out.println("Nilai b:"+b);
    }
    /**
     * @param args the command line arguments
     */
   
    }
    