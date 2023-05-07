package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SharebusConfirmationPage {

    public SharebusConfirmationPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Publish']//parent::button")
    WebElement publish_sharebus_button;

    public void click_on_publish_sharebus() throws InterruptedException {
        publish_sharebus_button.click();
        Thread.sleep(5000);
    }
}
