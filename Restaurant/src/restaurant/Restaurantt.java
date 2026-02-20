package restaurant;

public class Restaurantt {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurantt() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    // ================= TAMBAH MENU =================
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak boleh negatif!");
            return;
        }

        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
        nextId();
    }

    // ================= TAMPIL MENU =================
    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(
                        i + ". " + nama_makanan[i] +
                        " [" + stok[i] + "]\tRp. " + harga_makanan[i]
                );
            }
        }
    }
  
    // ================= PEMESANAN =================
    public void pesanMenu(int index, int jumlah) {
        if (index < 0 || index >= id) {
            System.out.println("Menu tidak tersedia!");
            return;
        }

        if (jumlah <= 0) {
            System.out.println("Jumlah pesan tidak valid!");
            return;
        }

        if (stok[index] >= jumlah) {
            stok[index] -= jumlah;
            double total = harga_makanan[index] * jumlah;

            System.out.println("Pesanan berhasil!");
            System.out.println("Menu  : " + nama_makanan[index]);
            System.out.println("Jumlah: " + jumlah);
            System.out.println("Total : Rp. " + total);
        } else {
            System.out.println("Pesanan ditolak, stok tidak mencukupi!");
        }
    }

    // ================= VALIDASI =================
    private boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    private static void nextId() {
        id++;
    }

    // ================= GETTER =================
    public String getNamaMakanan(int index) {
        return nama_makanan[index];
    }

    public double getHargaMakanan(int index) {
        return harga_makanan[index];
    }

    public int getStok(int index) {
        return stok[index];
    }

    // ================= SETTER =================
    public void setStok(int index, int stokBaru) {
        if (stokBaru < 0) {
            System.out.println("Stok tidak boleh negatif!");
            return;
        }
        stok[index] = stokBaru;
    }
}