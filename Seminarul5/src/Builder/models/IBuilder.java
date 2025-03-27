package Builder.models;

public interface IBuilder {
    Rezervare buildRezervare();
    Rezervare buildRezervare(String nume);

    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScauneErgonomice(boolean scauneErgonomice);
    IBuilder setDecorareMasa(boolean decorareMasa);
    IBuilder setGenMuzica(String genMuzica);
    IBuilder setNumeClient(String numeClient);
}
