package model.cdss;

import java.time.LocalDate;
import java.util.Date;

public class Dijagnoza {
	
	private LocalDate datum;
	private Bolest bolest;
	private String lekar;
	private Terapija terapija;
	
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public Bolest getBolest() {
		return bolest;
	}
	
	public void setBolest(Bolest bolest) {
		this.bolest = bolest;
	}
	
	public String getLekar() {
		return lekar;
	}
	
	public void setLekar(String lekar) {
		this.lekar = lekar;
	}
	
	public Terapija getTerapija() {
		return terapija;
	}
	
	public void setTerapija(Terapija terapija) {
		this.terapija = terapija;
	}
	
	
	
	

}
