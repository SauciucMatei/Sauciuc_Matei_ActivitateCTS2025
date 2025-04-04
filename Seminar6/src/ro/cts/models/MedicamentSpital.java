package ro.cts.models;

public class MedicamentSpital {
    private String nume;
    private int pret;

    public MedicamentSpital(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Este achizitionat medicamentul cu pretul: " + pret);
    }

    private void prezintaReteta() {
        System.out.println("A fost prezentata reteta pentru medicamentul: " + pret);
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }
}
