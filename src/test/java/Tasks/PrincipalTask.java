package Tasks;

import PageObjects.ItemAdicionadoPage;
import PageObjects.ItemProdutoPage;
import PageObjects.PrincipalPage;
import org.openqa.selenium.WebDriver;

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

        principalPage.getIncluirNoCarrinhoButton().click();

    }

}
