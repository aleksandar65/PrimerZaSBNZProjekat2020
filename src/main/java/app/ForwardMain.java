package app;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import model.forward.Customer;
import model.forward.CustomerCategory;

public class ForwardMain {
	
	public static void main(String[] args) {
		// load up the knowledge base
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-chain-rules");
    	
    	Customer c = new Customer();
    	c.setCategory(CustomerCategory.NA);
    	c.setSpent_ammount(10000000);
    	c.setDiscount(0);
    	
    	kSession.insert(c);
    	kSession.fireAllRules();
	}

}
