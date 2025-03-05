package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil{
    private String idProfesor;
    private int ani;

    public Profesor(String nume, int varsta, String idProfesor) {
        super(nume, varsta);
        this.idProfesor = idProfesor;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb = new StringBuilder("Asistentul");
        sb.append(this.ani);
        sb.append(" ani");
        System.out.println(sb);
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Asistentul ");
        sb.append(super.nume);
        sb.append( "preda de obicei la seminar");
        System.out.println(sb);
    }
}
