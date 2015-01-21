package lham.projects.cucumber.continente;

import static org.junit.Assert.assertTrue;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ContinenteListarStepsDef extends ContinenteContext {

	private Continente filtro;
	private long continentesCadastrados;
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

	@Dado("^que nao existam continentes cadastrados$")
	public void queNaoExistamContinentesCadastrados() throws Throwable {
		filtro = new Continente();
	}

	@Quando("^acesso a listagem de continentes$")
	public void acessoAListagemDeContinentes() throws Throwable {
		resposta = continenteRN.find(filtro);
	}

	@Entao("^devo receber uma lista vazia como resposta$")
	public void devoReceberUmaListaVaziaComoResposta() throws Throwable {
		assertTrue("Devo receber uma lista vazia como resposta.", resposta.isEmpty());
	}

	@Dado("^que existam registros cadastrados no banco$")
	public void queExistamRegistrosCadastradosNoBanco() throws Throwable {
		this.cadastrarContinentes();
	}

	@Dado("^nao passo filtro nenhum para a listagem$")
	public void naoPassoFiltroNenhumParaAListagem() throws Throwable {
		filtro = new Continente();
		resposta = continenteRN.find(filtro);
	}

	@Entao("^devo receber uma pagina da listagem total$")
	public void devoReceberUmaPaginaDaListagemTotal() throws Throwable {
		final int tamPagina = 2;
		assertTrue("Devo receber uma pagina da listagem total.", resposta.size() == tamPagina);
	}

	@Entao("^o numero total de continentes cadastrados$")
	public void oNumeroTotalDeContinentesCadastrados() throws Throwable {
		long tamTotal = continenteRN.count(filtro);
		assertTrue("Devo receber uma pagina da listagem total.", tamTotal == continentesCadastrados);
	}

	@Entao("^devo receber uma listagem com os registros ordenados por nome de forma crescente$")
	public void devoReceberUmaListagemComOsRegistrosOrdenadosPorNomeDeFormaCrescente()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	/*
	 * --------------------------------- métodos privados
	 */

	private void cadastrarContinentes() {
		continentesCadastrados = 6;

		super.cadastrarContinente("oce");
		super.cadastrarContinente("afr");
		super.cadastrarContinente("ams");
		super.cadastrarContinente("eur");
		super.cadastrarContinente("amn");
		super.cadastrarContinente("asi");
	}
}
