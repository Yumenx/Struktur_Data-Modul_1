package Latihan_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Drivers {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti,susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKonsumsi(nasi,air);
        listKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi : ");
        for (Konsumsi<Makanan,Minuman> Konsumsi : listKonsumsi) {
            Makanan makanan = Konsumsi.getM();
            Minuman minuman = Konsumsi.getI();

            System.out.println(makanan.diSantap());
            System.out.println(minuman.diSantap());
        }
    }
}