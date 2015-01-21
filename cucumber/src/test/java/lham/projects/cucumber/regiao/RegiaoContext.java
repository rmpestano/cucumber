package lham.projects.cucumber.regiao;

import lham.projects.cucumber.test.BaseIT;

public class RegiaoContext extends BaseIT {
	
	protected static RegiaoBD regiaoBD;
	protected static RegiaoRN regiaoRN;
	
	protected final void iniciarCenario() {
        super.startConnection();
        this.prepararCenario();
    }

    private void prepararCenario() {
    	regiaoBD = new RegiaoBD();
    	regiaoBD.setEntityManager(entityManager);

    	regiaoRN = new RegiaoRN();
    	regiaoRN.setContinenteBD(regiaoBD);
    	regiaoRN.setDAO(regiaoBD);
    }
}
