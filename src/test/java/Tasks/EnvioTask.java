package Tasks;

import PageObjects.EnvioPage;
import org.openqa.selenium.WebDriver;

public class EnvioTask {
    private WebDriver driver;
    private EnvioPage envioPage;

    public EnvioTask(WebDriver driver) {
        this.driver = driver;
        envioPage = new EnvioPage(driver);
    }

    public void aceitaTermos(){
        envioPage.getAceiteChechbox().click();
        envioPage.getContinuaAceiteButton().click();
    }

}
