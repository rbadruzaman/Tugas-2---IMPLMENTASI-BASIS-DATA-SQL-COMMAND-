public class Admin {
    private int id_admin;
    private String nama;
    private String usename;
    private char password;

    public Admin(int id_admin, String nama, String usename, char password) {
        this.id_admin = id_admin;
        this.nama = nama;
        this.usename = usename;
        this.password = password;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }
    
    
}
