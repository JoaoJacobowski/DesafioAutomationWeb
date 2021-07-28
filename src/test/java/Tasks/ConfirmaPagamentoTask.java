package Tasks;

import PageObjects.ConfirmaPagamentoPage;
import org.openqa.selenium.WebDriver;

public class ConfirmaPagamentoTask {
    private WebDriver driver;
    private ConfirmaPagamentoPage confirmaPagamentoPage;

    public ConfirmaPagamentoTask(WebDriver driver) {
        this.driver = driver;
        confirmaPagamentoPage = new ConfirmaPagamentoPage(driver);
    }

    public void confirmaPagamento(){
        confirmaPagamentoPage.getConfirmaPagamentoButton().click();
    }
}
