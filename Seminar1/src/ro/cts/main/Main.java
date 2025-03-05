package ro.cts.main;

import ro.cts.model.personal.*;
import ro.cts.model.platforma.Curs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Manole", 1, "lol", 12));
        studenti.add(new Student("Ionescu", 213, "test", 53));

        IPredabil profesor = new Profesor("Gilbert", 38, "123");

        Curs curs = new Curs("CTS", 123, profesor, studenti);

        curs.sustinereExamen();

        IPredabil asistent = new Asistent("Codrin", 123, "bla", 312);

        curs.setCadruDidactic(asistent);
        curs.sustinereExamen();

        ((Persoana) curs.getCadruDidactic()).afiseazaModInvatare();
    }
}
