package lham.projects.cucumber.continente;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

public class ContinenteFactory {

	public Continente criarContinente(String template) {
		this.createTeamFixture();
		return Fixture.from(Continente.class).gimme(template);
	}

	private void createTeamFixture() {
		Fixture.of(Continente.class).addTemplate("continenteValido",
				new Rule() {
					{
						add("nome", "América do Sul");
						add("codigo", "AMS ");
					}
				});
	}
}
