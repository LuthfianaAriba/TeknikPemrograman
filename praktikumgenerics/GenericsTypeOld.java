/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumgenerics;

/**
 *
 * @author ASUS
 */
public class GenericsTypeOld {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {

        GenericsTypeOld type = new GenericsTypeOld();

        type.set("Java");

        String str = (String) type.get(); // type casting

        System.out.println(str);
    }
}