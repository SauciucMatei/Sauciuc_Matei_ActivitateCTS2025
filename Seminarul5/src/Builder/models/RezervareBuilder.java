package Builder.models;

public class RezervareBuilder implements IBuilder{
    private Rezervare rezervare;

    public RezervareBuilder(String nume) {
        rezervare = new Rezervare(false,false,false,"fara muzica",nume);

    }

    @Override
    public Rezervare buildRezervare(String nume) {
        return new Rezervare(false,false,false,"fara muzica",nume);
    }

    @Override
    public Rezervare buildRezervare() {
        return new Rezervare(this.rezervare);
    }

    @Override
    public IBuilder setAsezareGeam(Boolean asezareGeam) {
        rezervare.setAsezareLaGeam(asezareGeam);
        return this;
    }

    @Override
    public IBuilder setScauneErgonomice(boolean scauneErgonomice) {
        rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    @Override
    public IBuilder setDecorareMasa(boolean decorareMasa) {
        rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    @Override
    public IBuilder setGenMuzica(String genMuzica) {
        rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public IBuilder setNumeClient(String numeClient) {
        rezervare.setNumeClient(numeClient);
        return this;
    }
}
