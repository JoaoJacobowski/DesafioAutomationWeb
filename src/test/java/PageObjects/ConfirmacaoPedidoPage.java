package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmacaoPedidoPage {
    private WebDriver driver;
    private Waits waits;

    public ConfirmacaoPedidoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getConfirmaPedidoText(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"center_column\"]/h1"));
    }
}
