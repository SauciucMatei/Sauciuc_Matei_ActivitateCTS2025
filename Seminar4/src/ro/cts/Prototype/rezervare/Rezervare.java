package ro.cts.Prototype.rezervare;

public class Rezervare extends ARezervare{
    protected Boolean isInterior;

    private Rezervare(Rezervare rezervare, int zi) {
        super(rezervare.nume, rezervare.ore, rezervare.nrPersoane, rezervare.zi);
        this.nume = rezervare.nume;
        this.isInterior = rezervare.isInterior;
        if ( zi>1 && zi <31) {
            this.zi = zi;
        } else {
            this.zi = rezervare.zi;
        }
        this.ore = rezervare.ore;
        this.nrPersoane = rezervare.nrPersoane;
    }

    public Rezervare(String nume, int ore, int nrPersoane, int zi, Boolean isInterior) {
        super(nume, ore, nrPersoane, zi);
        this.isInterior = isInterior;
    }

    @Override
    public ARezervare clonare(int zi) {
        return new Rezervare(this, zi);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrPersoane=").append(nrPersoane);
        sb.append(", isInterior=").append(isInterior);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", ore=").append(ore);
        sb.append(", zi=").append(zi);
        sb.append('}');
        return sb.toString();
    }
}
