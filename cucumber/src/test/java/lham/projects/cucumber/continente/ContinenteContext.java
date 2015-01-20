package lham.projects.cucumber.continente;

import lham.projects.cucumber.test.BaseIT;

public class ContinenteContext extends BaseIT {
	
	protected static ContinenteBD continenteBD;
	protected static ContinenteRN continenteRN;
	
	protected final void iniciarCenario() {
        super.startConnection();
        this.prepararCenario();
    }

    private void prepararCenario() {
    	continenteBD = new ContinenteBD();
    	continenteBD.setEntityManager(entityManager);

    	continenteRN = new ContinenteRN();
    	continenteRN.setContinenteBD(continenteBD);
    	continenteRN.setDAO(continenteBD);
    }
}