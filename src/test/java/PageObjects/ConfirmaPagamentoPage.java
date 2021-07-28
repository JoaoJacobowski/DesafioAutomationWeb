package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaPagamentoPage {
    private WebDriver driver;
    private Waits waits;

    public ConfirmaPagamentoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getConfirmaPagamentoButton(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
    }
}
