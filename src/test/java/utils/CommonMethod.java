package utils;

import driver.PageDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CommonMethod {

    public static String getCurrentUrl() {
        return PageDriver.getCurrentDriver().getCurrentUrl();
    }

    public static String getTitle() {
        return PageDriver.getCurrentDriver().getTitle();
    }

    public static void sendText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public static void selectByValue(WebElement select, String value) {
        Select select1 = new Select(select);
        select1.selectByValue(value);
    }

    public static void selectByVisibleText(WebElement select, String visible_text) {
        Select select1 = new Select(select);
        select1.selectByVisibleText(visible_text);
    }

    public static void selectByIndex(WebElement select, int index) {
        Select select1 = new Select(select);
        select1.selectByIndex(index);
    }

    public static void deselectAll(WebElement select) {
        Select select1 = new Select(select);
        select1.deselectAll();
    }

    public static void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }

    public static void scrollToTop() {
        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
        js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static String getAttribute(WebElement element, String attribute){
        return element.getAttribute(attribute);
    }

    public static ArrayList<String> getListOfText(List<WebElement> elements) {
        ArrayList<String> list = new ArrayList<>();
        for (WebElement element : elements) {
            list.add(element.getText().trim());
        }
        return list;
    }

}
