package fr.formation.banque;

public class Compte {

	private long numero;
	private double solde;
	private String referenceClient;

	public Compte() { }

	public Compte(long numero, double solde, String referenceClient) {
		this.numero = numero;
		this.solde = solde;
		this.referenceClient = referenceClient;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getReferenceClient() {
		return referenceClient;
	}

	public void setReferenceClient(String referenceClient) {
		this.referenceClient = referenceClient;
	}

}
