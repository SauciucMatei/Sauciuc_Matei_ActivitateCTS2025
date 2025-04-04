package ro.cts.main;

import ro.cts.adapter.AdapterMedicament;
import ro.cts.models.MedicamentFarmacie;
import ro.cts.models.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie) {
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("MedFarmacie", 23, false, "lol");
        vindeMedicament(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital("MedSpital", 55);
        AdapterMedicament adapterMedicament = new AdapterMedicament(medicamentSpital);
        vindeMedicament(adapterMedicament);
    }
}
