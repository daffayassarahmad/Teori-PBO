public class Main {
    public static void main(String[] args) {

        //Membuat objek Handphone
        Handphone hp = new Handphone("Iphone","Iphone 13");
        hp.nyalakan();
        hp.kirimPesan("0831818129112", "Halo apakabar?");
        hp.kirimPesan("0893717281782", "08931727218", " baik");
        hp.matikan();
        System.out.println();

        //Membuat objek Smartphone
        Smartphone sp = new Smartphone("Samsung", "Galaxy 10");
        sp.nyalakan();
        sp.kirimPesan("0893371871227", "Hape baruu");
        sp.kirimPesan("daffayassarahmad23@gmail.com", "Tugas-Teori-PBO", "Tugas Berhasil dikumpulkan");
        sp.aksesInternet();
        System.out.println();

        //Membuat objek FeaturePhone
        FeaturePhone fp = new FeaturePhone ("Esia","999");
        fp.nyalakan();
        fp.mainGameSnake();
        fp.matikan();
        System.out.println();

    }
}