package universitas;

public class Mahasiswa {
    private String npm;
    private String nama;
    private String prodi;
    
    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public String getDetail() {
        return "NPM: " + npm + "\nNama: " + nama + "\nProdi: " + prodi;
    }
}
