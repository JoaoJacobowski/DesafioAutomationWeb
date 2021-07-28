package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.ConfirmacaoPedidoPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ConfirmacaoPedidoTask {
    private WebDriver driver;
    private ConfirmacaoPedidoPage confirmacaoPedidoPage;

    public ConfirmacaoPedidoTask(WebDriver driver) {
        this.driver = driver;
        confirmacaoPedidoPage = new ConfirmacaoPedidoPage(driver);
    }

    public void ValidaConfirmacaoPedido(){

        try {
            Assertions.assertEquals(confirmacaoPedidoPage.getConfirmaPedidoText().getText(), "ORDER CONFIRMATION");
            Report.log(Status.PASS, "Pedido confirmado co sucesso!", Screenshot.fullPageBase64(driver));
        } catch (Exception e){
            Report.log(Status.FAIL, "Erro na confirmação do pedido!", Screenshot.fullPageBase64(driver));
        }
    }
}
