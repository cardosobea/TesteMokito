package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe base para a criação das novas PageObjects
 * todas as pages herdam esta classe
 */
public class BasePO {
	
	//*Driver base que será usado pelas pages
	
	protected WebDriver driver;
	
	//construtor base para a criação da fábrica de elementos (PagaFactory)
	//@param driver (Driver do navegador atual)
	
	
	public BasePO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
