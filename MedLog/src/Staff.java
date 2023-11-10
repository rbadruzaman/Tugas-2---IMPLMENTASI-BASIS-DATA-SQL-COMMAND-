public class Staff {

    private int id_staff;

    private String nama;

    private String username;

    private char password;

    public Staff(int id_staff, String nama, String username, char password) {
        this.id_staff = id_staff;
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public int getId_staff() {
        return id_staff;
    }

    public void setId_staff(int id_staff) {
        this.id_staff = id_staff;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }
    
}
