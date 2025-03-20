package ro.cts.Prototype.rezervare;

public abstract class ARezervare {
    protected String nume;
    protected int ore;
    protected int nrPersoane;
    protected int zi;

    public ARezervare(String nume, int ore, int nrPersoane, int zi) {
        if (nume.length() > 3) {
            this.nume = nume;
        } else {
            this.nume = "Client";
        }
        if (ore > 10 && ore < 22) {
            this.ore = ore;
        }
        this.ore = ore;
        this.nrPersoane = nrPersoane;
        if ( zi > 0 && zi < 30) {
            this.zi = zi;
        } else {
            this.zi = 1;
        }
    }

    public abstract ARezervare clonare(int zi);
}
