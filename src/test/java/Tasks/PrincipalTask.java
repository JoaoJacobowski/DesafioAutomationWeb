package Tasks;

import PageObjects.ItemAdicionadoPage;
import PageObjects.PrincipalPage;
import Utils.FileOperations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PrincipalTask {
    private WebDriver driver;
    private PrincipalPage principalPage;
    private ItemAdicionadoPage itemAdicionadoPage;

    public PrincipalTask(WebDriver driver) {
        this.driver = driver;
        principalPage = new PrincipalPage(driver);
        itemAdicionadoPage = new ItemAdicionadoPage(driver);
    }

    public void adicionaItemAoCarrinho(){
        String produtoTexto = principalPage.getNameProductText().getText();
        Actions action = new Actions(driver);

        FileOperations.setProperties("data", "valorProduto", principalPage.getValorProdutoText().getText());

        action.moveToElement(principalPage.getProductImageLink()).build().perform();
        principalPage.getIncluirNoCarrinhoButton().click();

    }

}
