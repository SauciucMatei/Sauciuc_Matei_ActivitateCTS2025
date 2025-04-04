package ro.cts.models;


public class MedicamentFarmacie {
    private String nume;
    private int pret;
    private boolean isStoc;
    private String dataExpirare;

    public MedicamentFarmacie(String nume, int pret, boolean isStoc, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.isStoc = isStoc;
        this.dataExpirare = dataExpirare;
    }

    public void cumparaMedicament() {
        System.out.println("Am cumparat medicamentul " + nume + " cu pretul " + pret);
    }
}
