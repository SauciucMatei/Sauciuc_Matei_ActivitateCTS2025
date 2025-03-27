package Factory.models;

public class Papanasii extends FelMancare {
    private String crema;

    public Papanasii(float pret, int nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Papanasii{");
        sb.append("crema='").append(crema).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
