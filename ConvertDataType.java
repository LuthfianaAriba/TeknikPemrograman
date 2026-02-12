/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertdatatype;

/**
 *
 * @author ASUS
 */
class ConvertDataType {

    /**
     * @param args the command line arguments
     */
     static short methodOne(long l) {
            int i = (int) l; return (short)i;
            }
            public static void main(String[] args) {
                double d = 10.25; float f = (float) d;
                byte b = (byte) methodOne((long) f); System.out.println(b);}
        }
    

