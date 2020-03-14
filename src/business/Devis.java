package business;

import static enumerations.EStatusDevis.CREATED;
import static enumerations.EStatusDevis.UPDATED;
import static enumerations.EStatusDevis.VALIDATED;

import enumerations.EStatusDevis;
import exceptions.InvalidDevisStatus;

public class Devis {

	private int num;

	private EStatusDevis status;

	public Devis(int num) {
		this.num = num;
		this.setStatus(CREATED);
	}

	public int getNum() {
		return num;
	}

	public EStatusDevis getStatus() {
		return status;
	}

	public void setStatus (EStatusDevis status) {
		try {
			switch (status) {
			case CREATED:			
				this.setCreated();
				break;
			case UPDATED:	
				this.setUpdated();
				break;
			case VALIDATED:								
				this.setValidated();
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}					
	}
	
	private void setCreated() throws InvalidDevisStatus {		
		if (!this.getStatus().equals(CREATED)) {
			throw new InvalidDevisStatus("Erreur de statut");
		}		
	}
	
	private void setUpdated() throws InvalidDevisStatus {
		if (this.getStatus().equals(VALIDATED)) {
			throw new InvalidDevisStatus("Erreur de statut");
		}
		this.status = UPDATED;
	}
	
	private void setValidated() {
		this.status = VALIDATED;
	}
	
	

}
