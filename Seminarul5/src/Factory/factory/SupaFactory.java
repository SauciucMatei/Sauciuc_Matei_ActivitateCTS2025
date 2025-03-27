package Factory.factory;

import Factory.models.FelMancare;
import Factory.models.SupaCiuperci;
import Factory.models.SupaLegume;

public class SupaFactory implements TipMancareFactory{
    private int cantitate;

    public SupaFactory(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelMancare preparaFelMancare(tipMancare tip, float pret, int nrCalorii) {
        return switch(tip){
            case Supe.SUPA_CIUPERCI -> new SupaCiuperci(pret,nrCalorii,cantitate);
            case Supe.SUPA_LEGUME -> new SupaLegume(pret,nrCalorii,cantitate);
            default -> null;
        };
    }
}
