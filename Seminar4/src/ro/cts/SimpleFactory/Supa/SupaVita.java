package ro.cts.SimpleFactory.Supa;

public class SupaVita extends Supa {
    private static int discount;

    public SupaVita(int cantitate, float pret, Boolean hasArdei, Boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita " + super.getCantitate());
    }

    @Override
    public float calculeazaPretFinal() {
        return 0;
    }
}
