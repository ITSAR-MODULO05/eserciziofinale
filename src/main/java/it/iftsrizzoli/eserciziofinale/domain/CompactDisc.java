package it.iftsrizzoli.eserciziofinale.domain;

import java.io.Serializable;

public class CompactDisc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String titolo;
	private String autore;

	/**
	 * @param titolo
	 * @param autore
	 */
	public CompactDisc(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "CompactDisc [id=" + id + ", titolo=" + titolo + ", autore=" + autore + "]";
	}

}
