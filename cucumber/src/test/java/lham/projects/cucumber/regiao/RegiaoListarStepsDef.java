package lham.projects.cucumber.regiao;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class RegiaoListarStepsDef extends RegiaoContext {

	private Regiao filtro;
	private List<Regiao> resposta;

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
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Quando("^acesso a listagem de continentes$")
	public void acessoAListagemDeContinentes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Entao("^devo receber uma lista vazia como resposta$")
	public void devoReceberUmaListaVaziaComoResposta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Dado("^que existam registros cadastrados no banco$")
	public void queExistamRegistrosCadastradosNoBanco() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Dado("^nao passo filtro nenhum para a listagem$")
	public void naoPassoFiltroNenhumParaAListagem() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Entao("^devo receber uma pagina da listagem total$")
	public void devoReceberUmaPaginaDaListagemTotal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Entao("^o numero total de continentes cadastrados$")
	public void oNumeroTotalDeContinentesCadastrados() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Entao("^devo receber uma listagem com os registros ordenados por nome de forma crescente$")
	public void devoReceberUmaListagemComOsRegistrosOrdenadosPorNomeDeFormaCrescente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
		
	
	
	
//	@Dado("^que nao existam continentes cadastrados$")
//	public void queNaoExistamContinentesCadastrados() throws Throwable {
//		filtro = new Continente();
//	}
//
//	@Quando("^acesso a listagem de continentes$")
//	public void acessoAListagemDeContinentes() throws Throwable {
//		resposta = continenteRN.find(filtro);
//	}
//
//	@Entao("^devo receber uma lista vazia como resposta$")
//	public void devoReceberUmaListaVaziaComoResposta() throws Throwable {
//		assertTrue("Devo receber uma lista vazia como resposta.", resposta.isEmpty());
//	}
//
//	@Dado("^que existam registros cadastrados no banco$")
//	public void queExistamRegistrosCadastradosNoBanco() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Dado("^nao passo filtro nenhum para a listagem$")
//	public void naoPassoFiltroNenhumParaAListagem() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Entao("^devo receber uma pagina da listagem total$")
//	public void devoReceberUmaPaginaDaListagemTotal() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Entao("^o numero total de continentes cadastrados$")
//	public void oNumeroTotalDeContinentesCadastrados() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Entao("^devo receber uma listagem com os registros ordenados por nome de forma crescente$")
//	public void devoReceberUmaListagemComOsRegistrosOrdenadosPorNomeDeFormaCrescente()
//			throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}

}
