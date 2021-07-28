package Tasks;

import PageObjects.ItemAdicionadoPage;
import org.openqa.selenium.WebDriver;

public class ItemAdicionadoTask {
    private WebDriver driver;
    private ItemAdicionadoPage itemAdicionadoPage;

    public ItemAdicionadoTask(WebDriver driver) {
        this.driver = driver;
        itemAdicionadoPage = new ItemAdicionadoPage(driver);
    }

    public void irParaCheckout(){
        itemAdicionadoPage.getIrParaCkeckoutButton().click();
    }
}
