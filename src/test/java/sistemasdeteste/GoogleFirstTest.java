package sistemasdeteste;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFirstTest {
	private WebDriver driver;
	private String URL_BASE = "https://www.google.com";
	private String PATH_DRIVE = "src/test/resources/chromedriver.exe";
	
	private void iniciar() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL_BASE);
	}
	
	@Test
	public void pesquisaNoGoogleTest() {
	iniciar();
	
	//preparação	
	WebElement inputPesquisa = driver.findElement(By.name("q"));
	
	inputPesquisa.sendKeys("bolo de laranja" + Keys.ENTER);
	
	//execução
	String result = driver.findElement(By.id("result-stats")).getText();
	
	System.out.println(result);
	
	//verificação
	assertTrue(result, result.contains("Aproximadamente"));
	
	driver.quit();
	
	}
}
