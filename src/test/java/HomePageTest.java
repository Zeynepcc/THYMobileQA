import ProjectPages.HomePage;
import TestConfig.TestBase;
import com.thoughtworks.gauge.Step;

public class HomePageTest extends TestBase {

    @Step("Open mobile app")
    public void openProject()
    {
        new HomePage(driver).AcceptConfirm();
    }
    @Step("Click Buy Ticket")
    public void clickByTicket()
    {
        new HomePage(driver).ClickBuyTicket();
    }

}
