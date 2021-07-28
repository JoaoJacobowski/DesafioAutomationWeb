package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.CheckoutPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {
    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutTask(WebDriver driver) {
        this.driver = driver;
        checkoutPage = new CheckoutPage(driver);
    }

    public void validaItemNoCarrinho(){
        String numeroItensNoCarrinho = checkoutPage.getNumerodeItensNoCarrinhoText().getText();

        try {
            Assertions.assertEquals(numeroItensNoCarrinho, "1");
            Report.log(Status.PASS, "Número de itens no carrinho correto!", Screenshot.fullPageBase64(driver));
        } catch (Exception e){
            Report.log(Status.FAIL, "Número de itens no carrinho não está correto!", Screenshot.fullPageBase64(driver));
        }
    }

    public void continuaCheckout(){
        checkoutPage.getContinuarCheckoutButton().click();
    }

}
