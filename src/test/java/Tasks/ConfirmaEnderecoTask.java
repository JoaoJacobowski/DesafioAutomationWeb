package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.ConfirmaEnderecoPage;
import Utils.FileOperations;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ConfirmaEnderecoTask {
    private WebDriver driver;
    private ConfirmaEnderecoPage confirmaEnderecoPage;

    public ConfirmaEnderecoTask(WebDriver driver) {
        this.driver = driver;
         confirmaEnderecoPage = new ConfirmaEnderecoPage(driver);
    }

    public void validaEndereco(){
        try {
            String enderecoAtual = confirmaEnderecoPage.getEnderecoConfirmacaoText().getText();
            String enderecoExtraido = FileOperations.getProperties("data").getProperty("endereco");
            Assertions.assertEquals(enderecoExtraido, enderecoAtual);
            String cidadeAtual = confirmaEnderecoPage.getCidadeConfimacaoText().getText();
            String cidadeExtraido = FileOperations.getProperties("data").getProperty("cidade") +
                    ", " + FileOperations.getProperties("data").getProperty("estado") +
                    " " + FileOperations.getProperties("data").getProperty("cep");
            Assertions.assertEquals(cidadeExtraido, cidadeAtual);
            String paisAtual = confirmaEnderecoPage.getPaisConfimacaoText().getText();
            String paisExtraido = FileOperations.getProperties("data").getProperty("pais");
            Assertions.assertEquals(paisExtraido, paisAtual);
            String foneAtual = confirmaEnderecoPage.getFoneConfimacaoText().getText();
            String foneExtraido = FileOperations.getProperties("data").getProperty("fone");
            Assertions.assertEquals(foneExtraido, foneAtual);

            Report.log(Status.PASS, "A validação do endereço está correto!", Screenshot.fullPageBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "O endereço não confere.", Screenshot.fullPageBase64(driver));
        }
        confirmaEnderecoPage.getContinuaEnderecoButton().click();
    }


}
