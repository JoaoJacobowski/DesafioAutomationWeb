package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaEnderecoPage {
    private WebDriver driver;
    private Waits waits;

    public ConfirmaEnderecoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getEnderecoConfirmacaoText(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"address_delivery\"]/li[3]"));
    }

    public WebElement getCidadeConfimacaoText(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
    }

    public WebElement getPaisConfimacaoText(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"address_delivery\"]/li[5]"));
    }

    public WebElement getFoneConfimacaoText(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"address_delivery\"]/li[6]"));
    }

    public WebElement getContinuaEnderecoButton(){
        return waits.visibilityOfElement(By.name("processAddress"));
    }
}
