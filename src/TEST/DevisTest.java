package TEST;

import static enumerations.EStatusDevis.CREATED;
import static enumerations.EStatusDevis.UPDATED;
import static enumerations.EStatusDevis.VALIDATED;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import business.Devis;
import exceptions.InvalidDevisStatus;

public class DevisTest {

	private Devis devis;

	@Before
	public void setUp() {
		// Le statut du devis est 'CREATED';
		this.devis = new Devis(1);
	}

	@Test
	public void testStatutDevisInit_Created() {
		assertEquals(CREATED, devis.getStatus());
	}

	@Test
	public void testStatutDevisEstModifie_etStatutEgal_Updated() throws InvalidDevisStatus {
		this.devis.setStatus(UPDATED);
		assertEquals(UPDATED, devis.getStatus());
	}

	@Test
	public void testStatutDevisEstValide_etStatutEgal_Validated() throws InvalidDevisStatus {
		this.devis.setStatus(VALIDATED);
		assertEquals(VALIDATED, devis.getStatus());
	}

	@Test
	public void testStatutDevisEstValide_ChangeCreation() throws InvalidDevisStatus {
		this.devis.setStatus(VALIDATED);
		this.devis.setStatus(CREATED);
		assertEquals(VALIDATED, devis.getStatus());
	}

	@Test
	public void testStatutDevisEstValide_ChangeUpdated() throws InvalidDevisStatus {
		this.devis.setStatus(VALIDATED);
		this.devis.setStatus(UPDATED);
		assertEquals(VALIDATED, devis.getStatus());
	}
}


