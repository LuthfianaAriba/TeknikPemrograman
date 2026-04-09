package w7tekpro;
        
import java.util.Scanner;

class SumTask implements Runnable {
    private int start, end;
    private int result;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getResult() {
        return result;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + 
            " menghitung dari " + start + " sampai " + end);

        for (int i = start; i <= end; i++) {
            result += i;
        }

        System.out.println(Thread.currentThread().getName() + 
            " hasil parsial: " + result);
    }
}

public class ParallelSum {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread: ");
        int nThread = input.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int max = input.nextInt();

        Thread[] threads = new Thread[nThread];
        SumTask[] tasks = new SumTask[nThread];

        int range = max / nThread;
        int start = 1;

        // Pembagian tugas (Divide and Conquer)
        for (int i = 0; i < nThread; i++) {
            int end = (i == nThread - 1) ? max : start + range - 1;

            tasks[i] = new SumTask(start, end);
            threads[i] = new Thread(tasks[i], "Thread-" + (i + 1));

            start = end + 1;
        }

        // Menjalankan thread
        for (Thread t : threads) {
            t.start();
        }

        // Menunggu semua thread selesai
        for (Thread t : threads) {
            t.join();
        }

        // Menggabungkan hasil
        int total = 0;
        for (SumTask task : tasks) {
            total += task.getResult();
        }

        System.out.println("=== HASIL AKHIR: " + total + " ===");
    }
}