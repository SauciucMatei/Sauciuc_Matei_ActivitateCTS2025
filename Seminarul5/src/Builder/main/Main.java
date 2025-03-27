package Builder.main;

import Builder.models.IBuilder;
import Builder.models.Rezervare;
import Builder.models.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder rezervareBuilder = new RezervareBuilder("Test");
        Rezervare rezervare;
        Rezervare rezervare1;

        rezervare = rezervareBuilder.buildRezervare();
        rezervare1 = rezervareBuilder.setGenMuzica("rock").buildRezervare();

        System.out.println(rezervare);
        System.out.println(rezervare1);

    }
}
