/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumgenerics;

/**
 *
 * @author ASUS
 */
interface MinMax<T extends Comparable<T>> {
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    public T max() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }

        return v;
    }
}

public class Main {

    public static void main(String[] args) {

        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b','r','p','w'};

        MyClass<Integer> a = new MyClass<>(inums);
        MyClass<Character> b = new MyClass<>(chs);

        System.out.println("Nilai Integer Terbesar: " + a.max());
        System.out.println("Karakter Terbesar: " + b.max());
    }

}