package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.PagamentoPage;
import Utils.FileOperations;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class PagamentoTask {
    private WebDriver driver;
    private PagamentoPage pagamentoPage;

    public PagamentoTask(WebDriver driver) {
        this.driver = driver;
        pagamentoPage = new PagamentoPage(driver);
    }

    public void validaValorCompra(){
        String valorAtual = pagamentoPage.getValorCompraText().getText();
        String valorEsperado = FileOperations.getProperties("data").getProperty("valorProduto");
        try {
            Assertions.assertEquals(valorEsperado, valorAtual);
            Report.log(Status.PASS, "Valor da compra está correto!", Screenshot.fullPageBase64(driver));
        } catch (Exception e){
            Report.log(Status.FAIL, "Valor da compra não confere!", Screenshot.fullPageBase64(driver));
        }
    }

    public void selecionaPagamento(){
        pagamentoPage.getSelecionaPagamentoButton().click();
    }
}
