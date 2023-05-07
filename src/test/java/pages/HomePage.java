package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    WebElement sign_in_button;

    public void click_on_sign_in_button(){
        sign_in_button.click();
    }

}
