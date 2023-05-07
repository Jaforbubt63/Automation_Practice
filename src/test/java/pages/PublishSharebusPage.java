package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethod.scrollToElement;
import static utils.CommonMethod.sendText;

public class PublishSharebusPage {

    public PublishSharebusPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "(//input)[1]")
    WebElement trip_name_input;

    @FindBy(id = "sport0")
    WebElement sport_category;

    @FindBy(xpath = "//span[text()='Preview and publish']//parent::button")
    WebElement preview_and_publish_button;

    @FindBy(xpath = "//span[text()='Publish']//parent::button")
    WebElement publish_button;

    public void preview_and_publish(String trip_name) throws InterruptedException {
        sendText(trip_name_input, trip_name);
        sport_category.click();
        scrollToElement(preview_and_publish_button);
        Thread.sleep(2000);
        preview_and_publish_button.click();
        Thread.sleep(2000);
    }

    public void click_on_publish() throws InterruptedException {
        publish_button.click();
        Thread.sleep(5000);
    }



}
