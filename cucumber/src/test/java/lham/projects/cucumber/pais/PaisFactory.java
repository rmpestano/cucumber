package lham.projects.cucumber.pais;

import lham.projects.cucumber.continente.Continente;
import lham.projects.cucumber.continente.ContinenteFactory;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

public class PaisFactory {

	public Pais criarPaises(String template) {
		this.createTeamFixture();
		return Fixture.from(Pais.class).gimme(template);
	}
	
	private void createTeamFixture() {
		ContinenteFactory continenteFactory = new ContinenteFactory();
		final Continente  contAmericaSul = continenteFactory.criarContinente("ams");
		
		Fixture.of(Pais.class).addTemplate("br", new Rule() {
			{
				add("nome", "Brasil");
				add("codigo", "BR");
				add("continente", contAmericaSul);
			}
		});
		
		Fixture.of(Pais.class).addTemplate("chl", new Rule() {
			{
				add("nome", "Chile");
				add("codigo", "CHL");
				add("continente", contAmericaSul);
			}
		});
		
	}
}
