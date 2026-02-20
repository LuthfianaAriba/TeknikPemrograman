package restaurant;
import java.util.Scanner;

public class RestauranttMain {
    public static void main(String[] args) {
        Restaurantt menu = new Restaurantt();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);

        System.out.println("=== DAFTAR MENU ===");
        menu.tampilMenuMakanan();

        System.out.println("\n=== PEMESANAN ===");
        menu.pesanMenu(0, 5);   // berhasil
        menu.pesanMenu(1, 25);  // ditolak

        System.out.println("\n=== STOK SETELAH PEMESANAN ===");
        menu.tampilMenuMakanan();
    }
}