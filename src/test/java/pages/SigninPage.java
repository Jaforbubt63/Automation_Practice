package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethod.sendText;

public class SigninPage {

    public SigninPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(id = "email")
    WebElement email_input;

    @FindBy(id = "password")
    WebElement password_input;

    @FindBy(xpath = "//form//button[normalize-space()='Sign in']")
    WebElement sign_in_button;

    public void sign_in(String email, String password) throws InterruptedException {
        sendText(email_input, email);
        sendText(password_input, password);
        sign_in_button.click();
    }

}
