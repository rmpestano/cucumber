package lham.projects.cucumber.continente;

import static org.junit.Assert.assertTrue;

import java.util.List;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ContinenteListarStepsDef extends ContinenteContext {

	private Continente filtro;
	private List<Continente> resposta;

	/*
	 * --------------------------------- Configuração
	 */

	@Before
	public void initializeScenario() {
		super.iniciarCenario();
	}

	@After
	public void finalizeScenario() {
		super.closeConnection();
	}

	/*
	 * --------------------------------- Cenários
	 */

	@Dado("^que não existam registros cadastrados no banco$")
	public void queNãoExistamRegistrosCadastradosNoBanco() throws Throwable {
		filtro = new Continente();
	}

	@Quando("^eu acesso a listagem de continentes$")
	public void euAcessoAListagemDeContinentes() throws Throwable {
		resposta = continenteRN.find(filtro);
	}

	@Entao("^devo receber uma lista vazia como resposta$")
	public void devoReceberUmaListaVaziaComoResposta() throws Throwable {
		assertTrue("Devo receber uma lista vazia como resposta.", resposta.isEmpty());
	}

	@Dado("^que existam registros cadastrados no banco$")
	public void queExistamRegistrosCadastradosNoBanco() throws Throwable {
		Continente continente = new ContinenteFactory().criarContinente("continenteValido");
		continenteRN.insert(continente);
	}

	@Entao("^devo receber uma listagem com todos os registros$")
	public void devoReceberUmaListagemComTodosOsRegistros() throws Throwable {
		filtro = new Continente();
		resposta = continenteRN.find(filtro);
	}

	@Entao("^devo receber uma lsitagem com os registros ordenados por nome de forma crescente$")
	public void devoReceberUmaLsitagemComOsRegistrosOrdenadosPorNomeDeFormaCrescente() throws Throwable {
		assertTrue("Devo receber uma lista vazia como resposta.", resposta.size() == 1);
	}
}
