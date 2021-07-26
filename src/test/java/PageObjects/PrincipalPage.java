package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage{
    private WebDriver driver;
    private Waits waits;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getProductImageLink(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img"));
    }

    public WebElement getNameProductText(){
        return waits.visibilityOfElement(By.xpath("//*[@id='homefeatured']/li[4]/div/div[2]/h5/a"));
    }

    public WebElement getIncluirNoCarrinhoButton(){
        return waits.visibilityOfElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]"));
    }

}
