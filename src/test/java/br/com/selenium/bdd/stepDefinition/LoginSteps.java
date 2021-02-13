package br.com.selenium.bdd.stepDefinition;

import br.com.selenium.bdd.pageObject.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	LoginPage samplePage = new LoginPage();


	
	@Dado("que estou na pagina {string}")
	public void que_estou_na_pagina(String url) {
		samplePage.getDriver().get(url);
	}

	@Quando("preencho o campo usuario com o valor {string}")
	public void preencho_o_campo_usuario_com_o_valor(String string) {
		samplePage.preencherUsuario(string);
	}

	@E("preencho o campo senha com o valor {string}")
	public void preencho_o_campo_senha_com_o_valor(String string) {
		samplePage.preencherSenha(string);
	}

	@Entao("clico no botão {string}")
	public void clico_no_botão(String nomeBotao) {
		samplePage.clicarBotao(nomeBotao);
	}

	
	@E("valido a mensagem e-mail invalido")
	public void valido_a_mensagem_e_mail_invalido() {
	   samplePage.validarMensagemDeErro();
	}

}
