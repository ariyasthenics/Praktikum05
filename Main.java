import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen list = new DataDosen();

        int pilih;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Termuda -> Tertua)");
            System.out.println("4. Sorting DSC (Tertua -> Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen d = new Dosen(kode, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC!");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC!");
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilih != 5);
    }
}