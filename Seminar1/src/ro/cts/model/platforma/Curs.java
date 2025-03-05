package ro.cts.model.platforma;

import ro.cts.model.personal.IPredabil;
import ro.cts.model.personal.Persoana;
import ro.cts.model.personal.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil cadruDidactic;
    private List<Student> studenti = new ArrayList<>();

    public Curs(String numeCurs, int credite, IPredabil cadruDidactic, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void sustinereExamen(){
        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(((Persoana)this.cadruDidactic).getNume()).append(" are examen la ").append(numeCurs).append(" cu urmatorii studenti: ");
        sb.append(studenti.stream().map(Persoana::getNume).collect(Collectors.joining(", ")));
        System.out.println(sb);
    }
}
