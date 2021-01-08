package fr.formation.banque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CompteTest {

	private Compte compte;
	
	@Before
	public void setUp() throws Exception {
		compte = new Compte(456123, 1000.00, "rupont@gmail.com");
	}

	@Test
	public void testCompte() {
		Compte compte = new Compte();
		assertNotNull(compte);
	}

	@Test
	public void testCompteLongDoubleString() {
		Compte compte = new Compte(568963, 5000.00, "smartin@gmail.com");
		assertNotNull(compte);
		assertEquals(568963, compte.getNumero());
		assertEquals(5000.00, compte.getSolde(), 0);
		assertEquals("smartin@gmail.com", compte.getReferenceClient());
	}

	@Test
	public void testGetNumero() {
		assertEquals(456123, compte.getNumero());
	}

	@Test
	public void testSetNumero() {
		compte.setNumero(896345);
		assertEquals(896345, compte.getNumero());
	}

	@Test
	public void testGetSolde() {
		assertEquals(1000.00, compte.getSolde(), 0);
	}

	@Test
	public void testSetSolde() {
		compte.setSolde(2000.00);
		assertEquals(2000.00, compte.getSolde(), 0);
	}

	@Test
	public void testGetReferenceClient() {
		assertEquals("rdupont@gmail.com", compte.getReferenceClient());
	}

	@Test
	public void testSetReferenceClient() {
		compte.setReferenceClient("bdubois@outlook.fr");
		assertEquals("bdubois@outlook.fr", compte.getReferenceClient());
	}

}
