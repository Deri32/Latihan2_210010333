package universitas;

public class mahasiswaBeraksi {
    public static void main(String[] args) {
        String npm = "210010333";
        String nama = "Muhammad Arika Deri";
        String prodi = "Fakultas Teknologi Informatika";

        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, prodi);

        System.out.println("Detail Mahasiswa:");
        System.out.println(mahasiswa.getDetail());
    }
}