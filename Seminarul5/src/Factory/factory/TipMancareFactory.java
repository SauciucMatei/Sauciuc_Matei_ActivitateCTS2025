package Factory.factory;

import Factory.models.FelMancare;

public interface TipMancareFactory {
   FelMancare preparaFelMancare(tipMancare tipMancare, float pret, int nrCalorii);
}
