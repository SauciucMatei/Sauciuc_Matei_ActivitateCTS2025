package ro.cts.Prototype.Main;

import ro.cts.Prototype.rezervare.ARezervare;
import ro.cts.Prototype.rezervare.Rezervare;

public class Main {
    public static void main(String[] args) {
        ARezervare r1 = new Rezervare("Rezervare 1", 1, 10, 10, false);
        ARezervare r2 = r1.clonare(20);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
