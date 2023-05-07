package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripPage {

    public TripPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//button[text()='My busses']")
    WebElement my_busses_button;

    public void click_on_my_busses() throws InterruptedException {
        my_busses_button.click();
        Thread.sleep(2000);
    }

}
