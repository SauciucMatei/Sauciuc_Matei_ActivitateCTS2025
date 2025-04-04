package ro.cts.adapter;

import ro.cts.models.MedicamentFarmacie;
import ro.cts.models.MedicamentSpital;

public class AdapterMedicament extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(String nume, int pret, boolean isStoc, String dataExpirare) {
        super(nume, pret, isStoc, dataExpirare);
    }

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret(), true, "none");
        this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
