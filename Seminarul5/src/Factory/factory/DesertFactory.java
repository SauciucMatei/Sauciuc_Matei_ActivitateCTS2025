package Factory.factory;

import Factory.models.Clatite;
import Factory.models.FelMancare;
import Factory.models.Papanasii;

public class DesertFactory implements TipMancareFactory {
    private String crema;

    public DesertFactory(String crema) {
        this.crema = crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }

    @Override
    public FelMancare preparaFelMancare(tipMancare tipMancare, float pret, int nrCalorii) {
        return switch (tipMancare) {
            case Desert.PAPANASI -> new Papanasii(pret, nrCalorii, crema);
            case Desert.CLATITE -> new Clatite(pret, nrCalorii, crema);
            default -> null;
        };
    }
}
