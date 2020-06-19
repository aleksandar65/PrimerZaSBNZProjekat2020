package model.cdss;

import java.util.List;

public class Lek {
	private String naziv;
	private TipLeka tip;
	private List<String> sastojci;
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public TipLeka getTip() {
		return tip;
	}
	public void setTip(TipLeka tip) {
		this.tip = tip;
	}
	public List<String> getSastojci() {
		return sastojci;
	}
	public void setSastojci(List<String> sastojci) {
		this.sastojci = sastojci;
	}
	
	
	
}
