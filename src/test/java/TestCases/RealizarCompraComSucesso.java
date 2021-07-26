package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.Screenshot;
import Framework.TestBase;
import Tasks.ItemAdicionadoTask;
import Tasks.ItemProdutoTask;
import Tasks.PrincipalTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucesso extends TestBase {
    private WebDriver driver = getDriver();
    private PrincipalTask principalTask = new PrincipalTask(driver);
    private ItemAdicionadoTask itemAdicionadoTask = new ItemAdicionadoTask(driver);
    private ItemProdutoTask itemProdutoTask = new ItemProdutoTask(driver);

    @Test
    public void realizarCompraComSucesso(){
        try {
            Report.createTest("Realizar compra com sucesso!!", ReportType.SINGLE);
            principalTask.adicionaItemAoCarrinho();
            itemAdicionadoTask.irParaCheckout();

        } catch (Exception e){
            e.printStackTrace();
            Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }

    }
}
