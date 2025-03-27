package Main;

import Factory.factory.SupaFactory;
import Factory.factory.Supe;
import Factory.factory.TipMancareFactory;
import Factory.models.FelMancare;

public class Main {
    public static void main(String[] args) {
        TipMancareFactory fabricaDeSupe = new SupaFactory(450);
        FelMancare supa1 = fabricaDeSupe.preparaFelMancare(Supe.SUPA_CIUPERCI, 30.5f, 200);
        FelMancare sup2 = fabricaDeSupe.preparaFelMancare(Supe.SUPA_LEGUME, 22.5f, 300);

        System.out.println(supa1.toString());
        System.out.println(sup2.toString());
    }
}
