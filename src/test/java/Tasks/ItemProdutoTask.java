package Tasks;

import PageObjects.ItemProdutoPage;
import org.openqa.selenium.WebDriver;

public class ItemProdutoTask {
    private WebDriver driver;
    private ItemProdutoPage itemProdutoPage;

    public ItemProdutoTask(WebDriver driver) {
        this.driver = driver;
        itemProdutoPage = new ItemProdutoPage(driver);
    }

    public void adicionaItemAoCarrinho(){
        itemProdutoPage.getAdicionaAoCarrinhoButton().click();
    }

}
