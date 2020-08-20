import ProjectPages.PassengerPage;
import TestConfig.TestBase;
import com.thoughtworks.gauge.Step;

import java.io.IOException;

public class PassengerTest extends TestBase {

    @Step("Fill information first passenger")
    public void PassengerInfo() throws IOException {

        new PassengerPage(driver).fillPassengerone();
    }
    @Step("ill information second passenger")
    public void SecondPassengerInfo() throws IOException
    {
        new PassengerPage(driver).secondpassenger();
    }
    @Step("Finished passenger prosesses")
    public void Continue()
    {
        new PassengerPage(driver).PassengerContinue();
    }
}
