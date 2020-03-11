package business;

import static enumerations.EStatusFacture.CREATED;

import enumerations.EStatusFacture;

public class Facture {

	private Devis devis;

	private EStatusFacture status;

	public Facture(Devis devis) {
		this.devis = devis;
		setStatus(CREATED);

	}

	public EStatusFacture getStatus() {
		return status;
	}

	public void setStatus(EStatusFacture status) {
		this.status = status;
	}

	public Devis getDevis() {
		return devis;
	}

}
