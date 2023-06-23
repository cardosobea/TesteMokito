package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; 

public class GooglePO extends BasePO {
	//Ctrl+V de GoogleRefatoratoTest
	//Preparação da automação
	//WebElement inputPesquisa = driver.findElement(By.name("q"));
	
	@FindBy(name = "q")
	public WebElement inputPesquisa;

	//driver.findElement(By.id("result-stats")).getText();
	@FindBy(id = "result-stats")
	public WebElement divResultadoPesquisa;
	
public GooglePO(WebDriver driver) {
	super(driver);
	}
}
