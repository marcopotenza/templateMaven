package gestione.dto;

public class LibroDTO {

	private int codice;
	private String titolo;
	private String descrizione;
	private double prezzo;
	private int valutazione;

	public LibroDTO() {
	}

	public LibroDTO(int codice, String titolo, String descrizione, double prezzo, int valutazione) {
		this.codice = codice;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.valutazione = valutazione;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getValutazione() {
		return valutazione;
	}

	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}

}
