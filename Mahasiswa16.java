public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    //konsttruktor dafault
    Mahasiswa16(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("nama: " +nama);
        System.out.println("nim: " +nim);
        System.out.println("kelas: " +kelas);
        System.out.println("ipk: " +ipk);
    }

    
}