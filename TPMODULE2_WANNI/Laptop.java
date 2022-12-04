package praktikum;

public class Laptop extends Perangkat {
    protected Boolean webcam;

    public Laptop(String drive, int ram, float processor, Boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi() {
        System.out.println("Laptop ini memiliki drive tipe" + " " + drive + " " + "dengan ram sebesar " + ram
        + " " + "GB dan processor secepat" + " " + processor + " " + "Ghz. " + "Selain itu Laptop ini "
        + (webcam == false ? "TIDAK memiliki " : "juga memiliki ") + "webcam");
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }
    
    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirimEmail2(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " " + "dan ke " + email2);
    }

    
}
