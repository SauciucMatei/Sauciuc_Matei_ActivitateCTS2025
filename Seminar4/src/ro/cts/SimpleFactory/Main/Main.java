package ro.cts.SimpleFactory.Main;

import ro.cts.SimpleFactory.Bucatarie.Bucatarie;
import ro.cts.SimpleFactory.Bucatarie.TipSupa;
import ro.cts.SimpleFactory.Supa.Supa;
import ro.cts.SimpleFactory.Supa.SupaLegume;

public class Main {
    public static void main(String[] args) {
        Bucatarie bucatarie1= new Bucatarie(250,25.5f);
        Supa supaLegume= bucatarie1.getSupa(TipSupa.LEGUME,true,false);
        Supa supaVita=bucatarie1.getSupa(TipSupa.VITA,false,true);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();

        Bucatarie bucatarie2= new Bucatarie(250,25.5f);


    }
}
