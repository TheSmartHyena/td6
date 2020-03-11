package business;

import static enumerations.EStatusDevis.CREATED;

import enumerations.EStatusDevis;

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

	private EStatusDevis getStatus() {
		return status;
	}

	private void setStatus(EStatusDevis status) {
		this.status = status;
	}

}
