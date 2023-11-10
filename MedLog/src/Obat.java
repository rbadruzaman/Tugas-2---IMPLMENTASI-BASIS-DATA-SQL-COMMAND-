public class Obat {

    private int id_obat;

    private String nama_obat;

    private String jenis_obat;

    private int kuantitas;

    public Obat(int id_obat, String nama_obat, String jenis_obat, int kuantitas) {
        this.id_obat = id_obat;
        this.nama_obat = nama_obat;
        this.jenis_obat = jenis_obat;
        this.kuantitas = kuantitas;
    }

    public int getId_obat() {
        return id_obat;
    }

    public void setId_obat(int id_obat) {
        this.id_obat = id_obat;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getJenis_obat() {
        return jenis_obat;
    }

    public void setJenis_obat(String jenis_obat) {
        this.jenis_obat = jenis_obat;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }
}
