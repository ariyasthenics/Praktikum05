import java.util.Scanner;
public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine(); // buang enter

        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // buang enter
            Mahasiswa16 m = new Mahasiswa16(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        System.out.println("Data sebelum sorting:");
        list.tampil();

        list.bubleSort();

        System.out.println("Data setelah sorting (desc):");
        list.tampil();

        System.out.println("data yang sudah terurut menggunakan Slection sort (ASC) ");
        list.SelectionSort();
        list.tampil();
        System.out.println("data yang sudah ter urut menggunakan insertion sort (ASC)");
        list.insertionSort();
        list.tampil();

    }
}