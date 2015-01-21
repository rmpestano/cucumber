package lham.projects.cucumber.continente;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

public class ContinenteFactory {

	public Continente criarContinente(String template) {
		this.createTeamFixture();
		return Fixture.from(Continente.class).gimme(template);
	}

	private void createTeamFixture() {
		Fixture.of(Continente.class).addTemplate("ams", new Rule() {
			{
				add("nome", "América do Sul");
				add("codigo", "AMS");
			}
		});
		Fixture.of(Continente.class).addTemplate("amn", new Rule() {
			{
				add("nome", "américa do norte");
				add("codigo", "AMN ");
			}
		});
		Fixture.of(Continente.class).addTemplate("afr", new Rule() {
			{
				add("nome", "áfrica");
				add("codigo", "AFR ");
			}
		});
		Fixture.of(Continente.class).addTemplate("asi", new Rule() {
			{
				add("nome", "ÁSIA");
				add("codigo", "ASI ");
			}
		});
		Fixture.of(Continente.class).addTemplate("eur", new Rule() {
			{
				add("nome", "Europa");
				add("codigo", "EUR ");
			}
		});
		Fixture.of(Continente.class).addTemplate("oce", new Rule() {
			{
				add("nome", "Oceania");
				add("codigo", "OCE ");
			}
		});
	}
}
