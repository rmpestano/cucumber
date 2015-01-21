package lham.projects.cucumber.regiao;

import lham.projects.cucumber.pais.Pais;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

public class RegiaoFactory {

	public Regiao criarContinente(String template) {
		this.createTeamFixture();
		return Fixture.from(Regiao.class).gimme(template);
	}

	private void createTeamFixture() {
		final Pais brasil = new Pais();
		brasil.setCodigo("BR");
		brasil.setNome("Brasil");
		
		Fixture.of(Regiao.class).addTemplate("regiaoValida",
				new Rule() {
					{
						add("nome", "Sul");
						add("pais", brasil);
						add("area", 1000L);
					}
				});
	}
}
