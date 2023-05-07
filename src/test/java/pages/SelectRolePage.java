package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectRolePage {

    public SelectRolePage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(css = "span[class='p-dropdown-label p-inputtext']")
    WebElement select_role_dropdown;

    @FindBy(xpath = "//ul[@class='p-dropdown-items']//li[2]")
    WebElement sharelead_item;

    @FindBy(xpath = "//span[text()='Continue']//parent::button")
    WebElement continue_button;

    public void select_sharelead_item_and_continue() throws InterruptedException {
        select_role_dropdown.click();
        sharelead_item.click();
        continue_button.click();
        Thread.sleep(3000);
    }


}
