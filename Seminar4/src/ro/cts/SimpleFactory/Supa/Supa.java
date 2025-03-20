package ro.cts.SimpleFactory.Supa;

public abstract class Supa {
    private int cantitate;
    private float pret;
    private Boolean hasArdei;
    private Boolean hasSmantana;

    public Supa(int cantitate, float pret, Boolean hasArdei, Boolean hasSmantana) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.hasArdei = hasArdei;
        this.hasSmantana = hasSmantana;
    }

    public float getPretPer100g(){
        return (this.pret/this.cantitate)*100;
    }

    public abstract void afiseazaDescriere();

    public abstract float calculeazaPretFinal();

    public int getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }
}
