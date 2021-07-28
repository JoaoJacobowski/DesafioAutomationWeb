package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private Waits waits;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getEmailParaCriarUsuarioText(){
        return waits.visibilityOfElement(By.id("email_create"));
    }

    public WebElement getCriarUsuarioButton(){
        return waits.visibilityOfElement(By.id("SubmitCreate"));
    }
}
