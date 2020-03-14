package business;

import static enumerations.EStatusDevis.VALIDATED;
import static enumerations.EStatusFacture.CREATED;

import enumerations.EStatusFacture;
import exceptions.InvalidDevisStatus;

public class Facture {

	private Devis devis;

	private EStatusFacture status;

	public Facture(Devis devis) throws InvalidDevisStatus {
		if (!VALIDATED.equals(devis.getStatus())) {
			throw new InvalidDevisStatus("Status invalid");
		}
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
