package model.cdss;

import java.util.LinkedList;
import java.util.List;

public class Bolest {
	private String naziv;
	private List<Simptom> simptomi;
	
	public Bolest(String naziv) {
		this.naziv = naziv;
		this.simptomi = new LinkedList<Simptom>();
	}
	
	public Bolest(List<Simptom> simptomi) {
		this.simptomi = simptomi;
	}

	public List<Simptom> getSimptomi() {
		return simptomi;
	}

	public void setSimptomi(List<Simptom> simptomi) {
		this.simptomi = simptomi;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
	
	
}
