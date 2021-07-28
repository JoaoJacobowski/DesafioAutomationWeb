package Tasks;

import PageObjects.CadastroDeClientePage;
import Utils.FakerGenerator;
import Utils.FileOperations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroDeClienteTask {
    private WebDriver driver;
    private CadastroDeClientePage cadastroDeClientePage;

    public CadastroDeClienteTask(WebDriver driver) {
        this.driver = driver;
        cadastroDeClientePage = new CadastroDeClientePage(driver);
    }

    public void cadastrarCliente(){
        cadastroDeClientePage.getSexoMasculinoRadio().click();

        cadastroDeClientePage.getPrimeiroNomeText().sendKeys(FakerGenerator.getFirstName());
        cadastroDeClientePage.getPrimeiroNome2Text().sendKeys(cadastroDeClientePage.getPrimeiroNomeText().getText());

        cadastroDeClientePage.getUltimoNomeText().sendKeys(FakerGenerator.getLastName());
        cadastroDeClientePage.getUltimoNome2Text().sendKeys(cadastroDeClientePage.getUltimoNomeText().getText());

        cadastroDeClientePage.getSenhaText().sendKeys(FileOperations.getProperties("data").getProperty("senha"));

        String endereco = FakerGenerator.getAddress();
        cadastroDeClientePage.getEnderecoText().sendKeys(endereco);
        FileOperations.setProperties("data", "endereco", endereco);
        cadastroDeClientePage.getEstadoDropdown().selectByVisibleText(FileOperations.getProperties("data").getProperty("estado"));
        cadastroDeClientePage.getCEPText().sendKeys(FileOperations.getProperties("data").getProperty("cep"));
        String cidade = FakerGenerator.getCity();
        cadastroDeClientePage.getCidadeText().sendKeys(cidade);
        FileOperations.setProperties("data", "cidade",cidade);
        cadastroDeClientePage.getPaisDropdown().selectByVisibleText(FileOperations.getProperties("data").getProperty("pais"));
        String fone = FakerGenerator.getPhoneNumber();
        cadastroDeClientePage.getFoneText().sendKeys(fone);
        FileOperations.setProperties("data", "fone", fone);
        cadastroDeClientePage.getEnderecoAlternativoText().sendKeys(FakerGenerator.getAlternativeAdrress());

        cadastroDeClientePage.getEnviarCadastroButton().click();
    }
}
