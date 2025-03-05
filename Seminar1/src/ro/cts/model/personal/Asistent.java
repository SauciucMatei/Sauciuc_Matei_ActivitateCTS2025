package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;
    private float ani;

    public Asistent(String nume, int varsta, String idAsistent, float ani) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.ani = ani;
    }

    public String getIdAsistent() {
        return idAsistent;
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
