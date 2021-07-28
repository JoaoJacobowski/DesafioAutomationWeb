package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagamentoPage {
    private WebDriver driver;
    private Waits waits;

    public PagamentoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getValorCompraText(){
        return waits.visibilityOfElement(By.id("total_product"));
    }

    public WebElement getSelecionaPagamentoButton(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    }
}
