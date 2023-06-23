package sistemasdeteste;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleRefatoradoTest extends BaseTest {
	

	@Test
	public void pesquisaNoGoogleTest() {
		//Montagem do cenário: agora é feita quando são chamados:
		//@BeforeClass
		//public class void iniciar

		
	//preparação da automação	
	WebElement inputPesquisa = driver.findElement(By.name("q"));
	
	//execução da automação
	inputPesquisa.sendKeys("bolo de cenoura" + Keys.ENTER);
	
	String result = driver.findElement(By.id("result-stats")).getText();
	
	System.out.println(result);
	
	//verificação e analise: assert
	assertTrue(result, result.contains("Aproximadamente"));
	
	//driver.quit();
	//nao precisa mais da linha acima, pois é chamada por:
	//@AfterClass
	//public static void finalizar()
	}
}
