package test_cases;

import driver.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;

import static utils.Helper.generateRandomString;

public class test_case1 extends BaseDriver {

    @Test
    public void tc() throws InterruptedException {
        HomePage homePage = new HomePage();
        SigninPage signinPage = new SigninPage();
        SelectRolePage selectRolePage = new SelectRolePage();
        MyBusesPage myBusesPage = new MyBusesPage();
        SetupSharebusPage setupSharebusPage = new SetupSharebusPage();
        SharebusConfirmationPage sharebusConfirmationPage = new SharebusConfirmationPage();
        PublishSharebusPage publishSharebusPage = new PublishSharebusPage();
        TripPage tripPage = new TripPage();

        homePage.click_on_sign_in_button();
        signinPage.sign_in("brainstation23@yopmail.com", "Pass@1234");
        selectRolePage.select_sharelead_item_and_continue();
        myBusesPage.click_on_set_up_sharebus_button();

        setupSharebusPage.setup_sharebus("Oslo", "Kolbotn");

        setupSharebusPage.yes_handball_organization();
        setupSharebusPage.search_select_club_or_team("NTNUI");
        setupSharebusPage.click_on_continue();

        setupSharebusPage.no_need_tickets();
        setupSharebusPage.no_activate_ticket_discounts();
        setupSharebusPage.click_on_create_sharebus();

        sharebusConfirmationPage.click_on_publish_sharebus();

        String trip_name = generateRandomString(10);
        publishSharebusPage.preview_and_publish(trip_name);
        publishSharebusPage.click_on_publish();

        tripPage.click_on_my_busses();

        ArrayList<String> all_created_trip_name = myBusesPage.get_all_trip_name();
        Assert.assertTrue(all_created_trip_name.contains(trip_name));

    }

}
