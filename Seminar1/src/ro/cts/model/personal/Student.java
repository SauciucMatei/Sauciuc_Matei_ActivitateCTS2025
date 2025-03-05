package ro.cts.model.personal;

public class Student extends Persoana{
    private String idStudent;
    private int aniStudiu;

    public Student(String nume, int varsta, String idStudent, int ani) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.aniStudiu = ani;
    }

    public String getIdStudent() {
        return idStudent;
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb = new StringBuilder("Studentul ");
        sb.append(this.aniStudiu);
        sb.append(" ani");
        System.out.println(sb);
    }
}
