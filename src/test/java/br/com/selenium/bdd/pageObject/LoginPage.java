package br.com.selenium.bdd.pageObject;

import org.openqa.selenium.support.FindBy;

import br.com.selenium.utils.UserProfileUtils;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
	
	@FindBy(name = "email")
	private WebElementFacade cmpUsuario;
	
	@FindBy(name = "password")
	private WebElementFacade cmpSenha;
	
	@FindBy(id = "btnEntrar")
	private WebElementFacade btnLogin;
	
	@FindBy(xpath = "//*[@id='boxPassword']/div/span[3]")
	private WebElementFacade errorMensage;
	
	
	
	public void preencherUsuario(String valor) {
		cmpUsuario.sendKeys(valor);
	}
	
	public void preencherSenha(String userName) {
		cmpSenha.sendKeys(UserProfileUtils.getPassword(userName));
	}

	public void clicarBotao(String nomeBotao) {
		clickOn(btnLogin);
	}
	
	public void validarMensagemDeErro() {
		String mensage = errorMensage.getText();
		Assert.assertEquals("Usuário ou senha inválidos.", mensage);
	}
	

}
