package lham.projects.cucumber.continente;

import static org.junit.Assert.assertTrue;

import java.util.List;

import lham.projects.cucumber.infra.Ordem;
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
		filtro = new Continente();
		this.cadastrarContinentes();
	}

	@Dado("^nao passo filtro nenhum para a listagem$")
	public void naoPassoFiltroNenhumParaAListagem() throws Throwable {
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
	
	@Quando("^acesso a listagem de continentes informando ordenacao pelo campo nome$")
	public void acessoAListagemDeContinentesInformandoOrdenacaoPeloCampoNome() throws Throwable {
		Ordem ordem = new Ordem("nome");
		filtro.getPropLista().addOrdem(ordem);
		filtro.getPropLista().setTamanho(6);
		
		resposta = continenteRN.find(filtro);
	}

	@Entao("^devo receber uma listagem com os registros ordenados por nome de forma crescente$")
	public void devoReceberUmaListagemComOsRegistrosOrdenadosPorNomeDeFormaCrescente() throws Throwable {
		boolean condicao = "África".equalsIgnoreCase(resposta.get(0).getNome());
		assertTrue("Devo receber uma listagem com os registros ordenados por nome de forma crescente (get(0)).", condicao);
		
		condicao = "América do Norte".equalsIgnoreCase(resposta.get(1).getNome());
		assertTrue("Devo receber uma listagem com os registros ordenados por nome de forma crescente (get(1)).", condicao);
		
		condicao = "América do Sul".equalsIgnoreCase(resposta.get(2).getNome());
		assertTrue("Devo receber uma listagem com os registros ordenados por nome de forma crescente (get(2)).", condicao);
		
		condicao = "Ásia".equalsIgnoreCase(resposta.get(3).getNome());
		assertTrue("Devo receber uma listagem com os registros ordenados por nome de forma crescente (get(3)).", condicao);
		
		condicao = "Europa".equalsIgnoreCase(resposta.get(4).getNome());
		assertTrue("Devo receber uma listagem com os registros ordenados por nome de forma crescente (get(4)).", condicao);
		
		condicao = "Oceania".equalsIgnoreCase(resposta.get(5).getNome());
		assertTrue("Devo receber uma listagem com os registros ordenados por nome de forma crescente (get(5)).", condicao);
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
