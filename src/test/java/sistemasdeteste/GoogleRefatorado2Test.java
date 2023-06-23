package sistemasdeteste;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import pageobject.GooglePO;

public class GoogleRefatorado2Test extends BaseTest {
	
	private static GooglePO googlepage;
	
	@BeforeClass
	public static void prepararTestes() {
		driver.get("https://www.google.com");
		googlepage = new GooglePO(driver);
	}
	
	@Test
	public void pesquisaNoGoogle() {
		
		//execucao
		
		googlepage.inputPesquisa.sendKeys("receita de bolo de cenoura" + Keys.ENTER);
		
		String resultado = googlepage.divResultadoPesquisa.getText();
		
		//verificacao e analise: Asserts
	
	}

}
