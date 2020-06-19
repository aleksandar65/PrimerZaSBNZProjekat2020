package app;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import model.cdss.Bolest;
import model.cdss.Dijagnoza;
import model.cdss.Pacijent;
import model.cdss.Simptom;

public class CdssMain {

	public static void main(String[] args) {
		try {
			
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	Bolest b1 = new Bolest("Prehlada");
        	List<Simptom> simptomi1 = new LinkedList<>();
        	simptomi1.add(Simptom.CurenjeIzNosa);
        	simptomi1.add(Simptom.BolUGrlu);
        	simptomi1.add(Simptom.Glavobolja);
        	simptomi1.add(Simptom.Kijanje);
        	simptomi1.add(Simptom.Kasalj);
        	
        	b1.setSimptomi(simptomi1);
        	
        	Bolest b2 = new Bolest("Groznica");
        	List<Simptom> simptomi2 = new LinkedList<>();
        	simptomi2.add(Simptom.Kijanje);
        	simptomi2.add(Simptom.BolUGrlu);
        	simptomi2.add(Simptom.Kasalj);
        	simptomi2.add(Simptom.TemperaturaVecaOd38);
        	simptomi2.add(Simptom.CurenjeIzNosa);
        	simptomi2.add(Simptom.Glavobolja);
        	simptomi2.add(Simptom.Drhtavica);
        	
        	b2.setSimptomi(simptomi2);
        	
        	Bolest b3 = new Bolest("Upala krajnika");
        	List<Simptom> simptomi3 = new LinkedList<>();
        	simptomi3.add(Simptom.BolUGrlu);
        	simptomi3.add(Simptom.BolKojiSeSiriDoUsiju);
        	simptomi3.add(Simptom.Glavobolja);
        	simptomi3.add(Simptom.TemperaturaOd40Do41);
        	simptomi3.add(Simptom.Drhtavica);
        	simptomi3.add(Simptom.GubitakApetita);
        	simptomi3.add(Simptom.Umor);
        	simptomi3.add(Simptom.ZutiSekretIzNosa);
        	
        	b3.setSimptomi(simptomi3);
        	
        	Bolest b4 = new Bolest("Sinusna infekcija");
        	List<Simptom> simptomi4 = new LinkedList<>();
        	simptomi4.add(Simptom.OticanjeOkoOciju);
        	simptomi4.add(Simptom.Glavobolja);
        	simptomi4.add(Simptom.ZutiSekretIzNosa);
        	simptomi4.add(Simptom.BolUGrlu);
        	simptomi4.add(Simptom.TemperaturaVecaOd38);
        	simptomi4.add(Simptom.Kasalj);
        	
        	b4.setSimptomi(simptomi4);
        	
        	Pacijent p = new Pacijent();
        	List<Simptom> zalbe = new LinkedList<>();
        	zalbe.add(Simptom.CurenjeIzNosa);
        	zalbe.add(Simptom.Glavobolja);
        	zalbe.add(Simptom.BolUGrlu);
        	zalbe.add(Simptom.Kijanje);
        	zalbe.add(Simptom.TemperaturaVecaOd38);
        	zalbe.add(Simptom.Kasalj);
        	zalbe.add(Simptom.ZutiSekretIzNosa);
        	zalbe.add(Simptom.OticanjeOkoOciju);

        	p.setZalbe(zalbe);
        	Dijagnoza d = new Dijagnoza();
        	d.setDatum(LocalDate.now().minusDays(59));
        	d.setBolest(b1);
        	
        	p.getIstorijaBolesti().add(d);
        	
        	kSession.insert(b1);
        	kSession.insert(b2);
        	kSession.insert(b3);
        	kSession.insert(b4);
        	kSession.insert(p);
        	
        	kSession.fireAllRules();
        	
            
        } catch (Throwable t) {
            t.printStackTrace();
        }

	}

}
