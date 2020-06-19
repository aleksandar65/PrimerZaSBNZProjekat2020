package model.cdss;

import java.util.LinkedList;
import java.util.List;

public class Pacijent {
	private int id;
	private Bolest trenutnaBolest;
	private List<Dijagnoza> istorijaBolesti;
	private List<Simptom> zalbe;
	
	public Pacijent() {
		this.id = 0;
		trenutnaBolest = null;
		istorijaBolesti = new LinkedList<>();
		zalbe = new LinkedList<>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Bolest getTrenutnaBolest() {
		return trenutnaBolest;
	}
	public void setTrenutnaBolest(Bolest trenutnaBolest) {
		this.trenutnaBolest = trenutnaBolest;
	}
	public List<Dijagnoza> getIstorijaBolesti() {
		return istorijaBolesti;
	}
	public void setIstorijaBolesti(List<Dijagnoza> istorijaBolesti) {
		this.istorijaBolesti = istorijaBolesti;
	}
	public List<Simptom> getZalbe() {
		return zalbe;
	}
	public void setZalbe(List<Simptom> zalbe) {
		this.zalbe = zalbe;
	}
	
	
		
	

}
