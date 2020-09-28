package br.com.selenium.bdd.pageObject;

import org.openqa.selenium.support.FindBy;

import br.com.selenium.utils.UserProfileUtils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
	
	@FindBy(name = "email")
	private WebElementFacade cmpUsuario;
	
	@FindBy(name = "password")
	private WebElementFacade cmpSenha;
	
	@FindBy(name = "submit")
	private WebElementFacade btnLogin;
	
	
	public void preencherUsuario(String valor) {
		cmpUsuario.sendKeys(valor);
	}
	
	public void preencherSenha(String userName) {
		cmpSenha.sendKeys(UserProfileUtils.getPassword(userName));
	}

	public void clicarBotao(String nomeBotao) {
		clickOn(btnLogin);
	}

}
