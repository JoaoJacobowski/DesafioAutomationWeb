package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemProdutoPage {
    private WebDriver driver;
    private Waits waits;

    public ItemProdutoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getNameItemProductText(){
        return waits.visibilityOfElement(By.cssSelector(".pb-center-column.col-xs-12.col-sm-4 [itemprop='name']"));
    }

    public WebElement getAdicionaAoCarrinhoButton(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"buy_block\"]//span[contains(text(), \"Add to cart\")]"));
    }


}
