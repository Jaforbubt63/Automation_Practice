package pages;

import driver.PageDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static utils.CommonMethod.*;

public class SetupSharebusPage {

    public SetupSharebusPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(id = "startPoint")
    WebElement from_input;

    @FindBy(id = "destination")
    WebElement to_input;

    @FindBy(css = "input[placeholder='Departure Date']")
    WebElement departure_date;

    @FindBy(xpath = "(//input[@placeholder='Time'])[1]")
    WebElement departure_time;

    @FindBy(css = "input[placeholder='Return Date']")
    WebElement return_date;

    @FindBy(xpath = "(//input[@placeholder='Time'])[3]")
    WebElement return_time;

    @FindBy(xpath = "//span[text()='Today']//parent::button")
    WebElement today_button;

    @FindBy(css = "label[for='returnTripswitch']")
    WebElement return_trip_switch;

    @FindBy(xpath = "//span[text()='Continue']//parent::button")
    WebElement continue_button;

    @FindBy(xpath = "(//button[text()='Yes'])[1]")
    WebElement handball_organization_yes;

    @FindBy(css = "input[placeholder='Search or select']")
    WebElement search_or_select_input;

    @FindBy(css = "div[class='results'] ul li")
    List<WebElement> search_results;

    @FindBy(xpath = "(//button[text()='No'])[1]")
    WebElement no_need_tickets;

    @FindBy(xpath = "(//button[text()='No'])[2]")
    WebElement no_activate_ticket_discounts;

    @FindBy(xpath = "//span[text()='Create Sharebus']//parent::button")
    WebElement create_sharebus_button;


    public void click_on_continue(){
        continue_button.click();
    }

    public void setup_sharebus(String from, String to) throws InterruptedException {
        // From input
        sendText(from_input, from);
        Thread.sleep(2000);
        Actions actions = new Actions(PageDriver.getCurrentDriver());
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();

        // To input
        sendText(to_input, to);
        Thread.sleep(2000);
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();

        // Departure date
        scrollToElement(departure_date);
        Thread.sleep(2000);
        departure_date.click();
        Thread.sleep(2000);
        today_button.click();

        // Departure time
        Thread.sleep(2000);
        departure_time.click();

        return_trip_switch.click();

        Thread.sleep(2000);
        click_on_continue();
        Thread.sleep(15000);
    }

    public void yes_handball_organization() throws InterruptedException {
        handball_organization_yes.click();
        Thread.sleep(3000);
    }

    public void search_select_club_or_team(String search_item) {
        sendText(search_or_select_input, search_item);
        ArrayList<String> results = getListOfText(search_results);
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i).equals(search_item)) {
                search_results.get(i).click();
            }
        }
    }

    public void no_need_tickets() throws InterruptedException {
        no_need_tickets.click();
        Thread.sleep(2000);
    }

    public void no_activate_ticket_discounts() throws InterruptedException {
        scrollToElement(no_activate_ticket_discounts);
        Thread.sleep(2000);
        no_activate_ticket_discounts.click();
    }

    public void click_on_create_sharebus() throws InterruptedException {
        create_sharebus_button.click();
        Thread.sleep(15000);
    }

}
