package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static utils.CommonMethod.getListOfText;

public class MyBusesPage {

    public MyBusesPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//ul[contains(@class, 'navbar-nav')]//li[2]")
    WebElement sharelead_menu_option;

    @FindBy(xpath = "//ul[contains(@class, 'dropdown-menu')]//li[3]")
    WebElement sharelead_dropdown_option;

    @FindBy(xpath = "//span[text()='Set up a Sharebus']//ancestor::button")
    WebElement set_up_sharebus_button;

    @FindBy(css = "span[class='ms-2 text-start']")
    List<WebElement> all_trip_name;

    public void select_sharelead_from_menu(){
        sharelead_menu_option.click();
        sharelead_dropdown_option.click();
    }

    public void click_on_set_up_sharebus_button() throws InterruptedException {
        set_up_sharebus_button.click();
        Thread.sleep(2000);
    }

    public ArrayList<String> get_all_trip_name(){
        return getListOfText(all_trip_name);
    }


}
