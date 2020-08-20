import ProjectPages.TicketPage;
import TestConfig.TestBase;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

import java.io.IOException;

public class TicketPageTest extends TestBase {

    @Step("One way clicked")
    public void OneWay() throws IOException {
        new TicketPage(driver).OneWay();
    }

    @Step("Choose <from> to <to>")
    public void ChooseDirection(String from,String to) throws InterruptedException {

        new TicketPage(driver).ChooseDirection(from,to);
    }

    @Step("Select date")
    public void SelectDate() {
        new TicketPage(driver).SelectDate();
    }

    @Step("Clicked okey")
    public void ClickedOkey() {
        new TicketPage(driver).clickedOkey();
    }

    @Step("Add passanger")
    public void addPerson() {
        new TicketPage(driver).addPerson();
    }

    @Step("Search Fly")
    public void SearchFly() {
        new TicketPage(driver).SearchFly();
    }

    @Step("Listed")
    public void list() {

        int list_size = new TicketPage(driver).TicketList();
        Assert.assertTrue(list_size > 0);

    }
    @Step("Choose economic fly")
    public void ChooseTicket()
    {
        new TicketPage(driver).ChooseTicket();
    }
    @Step("Click Continue")
    public void ClickContinue()
    {
        new TicketPage(driver).goClick();
    }
}
