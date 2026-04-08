import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("-------------------------------");
            list.tambah(new Mahasiswa16(nim, nama, kelas, ipk));
        }

        list.tampil();

        System.out.println("=================================");
        System.out.println("Pencarian data");
        System.out.println("=================================");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();
        System.out.println("=================================");
        System.out.println("Menggunakan Binary search");
        System.out.println("=================================");
        list.insertionSort();
        double posisi2 = list.findBinarySearch(cari,0, jumMhs-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}