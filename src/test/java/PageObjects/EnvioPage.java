package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnvioPage {
    private WebDriver driver;
    private Waits waits;

    public EnvioPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getAceiteChechbox(){
        return driver.findElement(By.id("cgv"));
    }

    public WebElement getContinuaAceiteButton(){
        return waits.visibilityOfElement(By.name("processCarrier"));
    }
}
