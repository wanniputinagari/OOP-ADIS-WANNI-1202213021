package praktikum;

public class MainApp {
    public static void main(String [] args) {
        Perangkat perangkat = new Perangkat("ABC", 128, 1.2f);
        perangkat.informasi();

        System.out.println();

        Laptop laptop = new Laptop("Sandisk", 256, 2.6f, true);
        laptop.informasi();
        laptop.bukaGame("Big 2");
        laptop.kirimEmail("wanniputinagari@gmail.com");
        laptop.kirimEmail2("wanniputinagari@gmail.com", "wanniputt@gmail.com");

        System.out.println();

        Handphone hp = new Handphone("Seagate", 64, 2.8f, false);
        hp.informasi();
        hp.telfon(628525252);
        hp.kirimSMS(628222222);
        hp.kirimSMS2(46578, 628473283);
    }
}
