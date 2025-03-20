package ro.cts.SimpleFactory.Supa;

public class SupaCiuperci extends Supa{
    private static int discount;

    public SupaCiuperci(int cantitate, float pret, Boolean hasArdei, Boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public void afiseazaDescriere() {

    }

    @Override
    public float calculeazaPretFinal() {
        return 0;
    }
}
