package app;

import java.time.LocalDate;
import java.util.Arrays;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import model.cdss.Dijagnoza;
import model.cdss.Lek;
import model.cdss.Pacijent;
import model.cdss.Terapija;
import model.cdss.TipLeka;

public class AddictMain {

	public static void main(String[] args) {
		// load up the knowledge base
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-report-rules");
    	
    	
    	Lek analgetik = new Lek();
    	analgetik.setNaziv("Analgetik");
    	analgetik.setTip(TipLeka.Analgetik);
    	
    	Lek antibiotik = new Lek();
    	antibiotik.setNaziv("Antibiotik");
    	antibiotik.setTip(TipLeka.Antibiotik);
    	
    	Lek diuretik = new Lek();
    	diuretik.setNaziv("Diuretik");
    	diuretik.setTip(TipLeka.Diuretik);
    			
    	
    	
    	
    	Pacijent p = new Pacijent();
    	Dijagnoza d1= new Dijagnoza();
    	d1.setDatum(LocalDate.now().minusMonths(5));
    	d1.setLekar("Pera");
    	Terapija t1 = new Terapija();
    	t1.setLekovi(Arrays.asList(new Lek[]{analgetik, diuretik}));
    	d1.setTerapija(t1);
    	
    	Dijagnoza d2= new Dijagnoza();
    	d2.setDatum(LocalDate.now().minusMonths(4));
    	d2.setLekar("Mika");
    	Terapija t2 = new Terapija();
    	t2.setLekovi(Arrays.asList(new Lek[]{antibiotik}));
    	d2.setTerapija(t2);
    	
    	Dijagnoza d3= new Dijagnoza();
    	d3.setDatum(LocalDate.now().minusMonths(4));
    	d3.setLekar("Mika");
    	Terapija t3 = new Terapija();
    	t3.setLekovi(Arrays.asList(new Lek[]{antibiotik, analgetik}));
    	d3.setTerapija(t3);
    	
    	Dijagnoza d4= new Dijagnoza();
    	d4.setDatum(LocalDate.now().minusMonths(3));
    	d4.setLekar("Mika");
    	Terapija t4 = new Terapija();
    	t4.setLekovi(Arrays.asList(new Lek[]{antibiotik, analgetik}));
    	d4.setTerapija(t4);
    	
    	Dijagnoza d5= new Dijagnoza();
    	d5.setDatum(LocalDate.now().minusMonths(3));
    	d5.setLekar("Zika");
    	Terapija t5 = new Terapija();
    	t5.setLekovi(Arrays.asList(new Lek[]{antibiotik, analgetik}));
    	d5.setTerapija(t5);
    	
    	Dijagnoza d6= new Dijagnoza();
    	d6.setDatum(LocalDate.now());
    	d6.setLekar("Zika");
    	Terapija t6 = new Terapija();
    	t6.setLekovi(Arrays.asList(new Lek[]{antibiotik, analgetik}));
    	d6.setTerapija(t6);
    	
    	Dijagnoza d7= new Dijagnoza();
    	d7.setDatum(LocalDate.now());
    	d7.setLekar("Zika");
    	Terapija t7 = new Terapija();
    	t7.setLekovi(Arrays.asList(new Lek[]{antibiotik, analgetik}));
    	d7.setTerapija(t7);
    	
    	Dijagnoza d8= new Dijagnoza();
    	d8.setDatum(LocalDate.now());
    	d8.setLekar("Djoka");
    	Terapija t8 = new Terapija();
    	t8.setLekovi(Arrays.asList(new Lek[]{antibiotik, analgetik}));
    	d8.setTerapija(t8);
    	
    	p.setIstorijaBolesti(Arrays.asList(new Dijagnoza[] {d1,d2,d3,d4,d5,d6,d7, d8}));
    	
    	kSession.insert(p);
    	
    	kSession.fireAllRules();
    			
    	

	}

}
