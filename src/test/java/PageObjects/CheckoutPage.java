package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;
    private Waits waits;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getNumerodeItensNoCarrinhoText(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]"));
    }

    public WebElement getContinuarCheckoutButton(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
    }

}
