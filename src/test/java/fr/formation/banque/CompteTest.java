package fr.formation.banque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CompteTest {

	// Référence de l'objet à tester
	private Compte compte;
	
	@Before
	public void setUp() {
		// Créer l'objet à tester. Il sera recréé avant chaque test
		compte = new Compte(456236, 1000.00, "rdupont@gmail.com");
	}

	@Test
	public void testGetNumero() {
		// On appelle la méthode à tester
		long numero = compte.getNumero();
		// On compare la valeur retournée avec la valeur attendue
		assertEquals(45236, numero);
		
		// assertTrue(456236 == numero);
	}
	
	@Test
	public void testSetNumero() {
		compte.setNumero(968563);
		// Pas le choix d'appeler le getNumero....
		long numero = compte.getNumero();
		assertEquals(968563, numero);
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
		compte.setReferenceClient("smartin@yahoo.fr");
		assertEquals("smartin@yahoo.fr", compte.getReferenceClient());
	}
	
	@Test 
	public void testCompte() {
		// Test du constructeur sans paramètres...
		Compte compte = new Compte();
		
		assertNotNull(compte);
		// ...
	}
	
	@Test
	public void testCompteParams() {
		Compte compte = new Compte(965423, 255.23, "sduport@outlook.fr");
		
		assertNotNull(compte);
		assertEquals(965423, compte.getNumero());
		assertEquals(255.23, compte.getSolde(), 0);
		assertEquals("sduport@outlook.fr", compte.getReferenceClient());
	}
}
