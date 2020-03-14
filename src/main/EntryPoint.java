package main;

import business.Devis;
import business.Facture;

public class EntryPoint {

	public static void main(String[] args) {
		
		try {
			
			Devis devis = new Devis(1);
			Facture facture = new Facture(devis);
			
		} catch (Exception e) {
            e.printStackTrace();
		}



	}

}
