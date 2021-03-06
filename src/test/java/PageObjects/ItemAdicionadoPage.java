package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemAdicionadoPage {
    private WebDriver driver;
    private Waits waits;

    public ItemAdicionadoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getIrParaCkeckoutButton(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
    }

}
