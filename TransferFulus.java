/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package w7tekpro;

class Account {
    int balance = 150;
}

public class TransferFulus {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account();
        Account acc2 = new Account();

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (acc1) { // Mengunci acc1 terlebih dahulu
                System.out.println("Thread 1: Mengunci acc1");

                try { Thread.sleep(100); } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (acc2) { // Mengunci acc2 setelah acc1
                    System.out.println("Thread 1: Transfer dari acc1 ke acc2");
                    acc2.balance += acc1.balance;
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (acc1) { // DIUBAH: sekarang urutan sama (acc1 dulu)
                System.out.println("Thread 2: Mengunci acc1");

                try { Thread.sleep(100); } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (acc2) { // Baru acc2
                    System.out.println("Thread 2: Transfer dari acc2 ke acc1");
                    acc1.balance += acc2.balance;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join(); // Menunggu thread 1 selesai
        t2.join(); // Menunggu thread 2 selesai

        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Saldo Akhir acc1: " + acc1.balance);
        System.out.println("Saldo Akhir acc2: " + acc2.balance);
    }
}