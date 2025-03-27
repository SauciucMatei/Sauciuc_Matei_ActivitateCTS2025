package Builder.models;

public class Rezervare {
    private boolean asezareLaGeam;
    public boolean scauneErgonomice;
    public boolean decorareMasa;
    public String genMuzica;
    public String numeClient;

    protected Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareMasa, String genMuzica, String numeClient) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.genMuzica = genMuzica;
        this.numeClient = numeClient;
    }

    public Rezervare() {
    }

    public Rezervare(Rezervare rezervare) {
        this.asezareLaGeam=rezervare.asezareLaGeam;
        this.scauneErgonomice=rezervare.scauneErgonomice;
        this.decorareMasa=rezervare.decorareMasa;
        this.genMuzica=rezervare.genMuzica;
        this.numeClient=rezervare.numeClient;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
