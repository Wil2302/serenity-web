package br.com.selenium.bdd.stepDefinition;

import br.com.selenium.bdd.pageObject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	LoginPage samplePage = new LoginPage();

	@Before("@TMJ")
	public void setParametersTMJ(Scenario scenario) {

	}

	@Before
	public void beforehook(Scenario scenario) throws Exception {

	}

	@After
	public void updateResultTMJ(Scenario scenario) throws Exception {

	}

	@Quando("preencho o campo usuario com o valor {string}")
	public void preencho_o_campo_usuario_com_o_valor(String string) {
		samplePage.preencherUsuario(string);
	}

	@Quando("preencho o campo senha com o valor {string}")
	public void preencho_o_campo_senha_com_o_valor(String string) {
		samplePage.preencherSenha(string);
	}

	@Dado("que estou na pagina {string}")
	public void queEstouNaPaginaDeLogin(String url) {
		samplePage.getDriver().get(url);
	}

	@Dado("clico no botão {string}")
	public void clicoNoBotão(String nomeBotao) {
		samplePage.clicarBotao(nomeBotao);
	}

}
