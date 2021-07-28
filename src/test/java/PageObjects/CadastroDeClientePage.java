package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadastroDeClientePage {
    private WebDriver driver;
    private Waits waits;

    public CadastroDeClientePage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getSexoMasculinoRadio(){
        return waits.visibilityOfElement(By.id("id_gender1"));
    }

    public WebElement getSexoFemininoRadio(){
        return waits.visibilityOfElement(By.id("uniform-id_gender2"));
    }

    public WebElement getPrimeiroNomeText(){
        return waits.visibilityOfElement(By.id("customer_firstname"));
    }

    public WebElement getUltimoNomeText(){
        return waits.visibilityOfElement(By.id("customer_lastname"));
    }

    public WebElement getSenhaText(){
        return waits.visibilityOfElement(By.id("passwd"));
    }

    public WebElement getPrimeiroNome2Text(){
        return waits.visibilityOfElement(By.cssSelector("input#firstname"));
    }

    public WebElement getUltimoNome2Text(){
        return waits.visibilityOfElement(By.cssSelector("input#lastname"));
    }

    public WebElement getEnderecoText(){
        return waits.visibilityOfElement(By.id("address1"));
    }

    public WebElement getCidadeText(){
        return waits.visibilityOfElement(By.id("city"));
    }

    public Select getEstadoDropdown(){
        return new Select(driver.findElement(By.id("id_state")));
    }

    public WebElement getCEPText(){
        return waits.visibilityOfElement(By.id("postcode"));
    }

    public Select getPaisDropdown(){
        return new Select(driver.findElement(By.id("id_country")));
    }

    public WebElement getFoneText(){
        return waits.visibilityOfElement(By.id("phone_mobile"));
    }

    public WebElement getEnderecoAlternativoText(){
        return waits.visibilityOfElement(By.id("alias"));
    }

    public WebElement getEnviarCadastroButton(){
        return waits.visibilityOfElement(By.id("submitAccount"));
    }
}
