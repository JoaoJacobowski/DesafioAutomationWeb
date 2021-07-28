package Tasks;

import PageObjects.LoginPage;
import Utils.FakerGenerator;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public void irParaCriarUsuario(){
        loginPage.getEmailParaCriarUsuarioText().sendKeys(FakerGenerator.getEmailAddress());
        loginPage.getCriarUsuarioButton().click();
    }
}
