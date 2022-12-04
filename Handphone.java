package praktikum;

public class Handphone extends Perangkat {
    protected Boolean fingerprint;
    
    public Handphone (String drive, int ram, float processor, Boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi() {
        System.out.println("Handphone ini memiliki drive tipe" + " " + drive + " " + "dengan ram sebesar " + ram
        + " " + "GB dan processor secepat" + " " + processor + " " + "Ghz. " + "Selain itu handphone ini "
        + (fingerprint == false ? "TIDAK memiliki " : "juga memiliki ") + "fingeprint");
    }

    public void telfon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + no_hp);
    }
    
    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
    }

    public void kirimSMS2(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " " + "dan ke No " + no_hp2);
    }
}
    

