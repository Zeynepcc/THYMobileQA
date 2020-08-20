package ProjectPages;

import SampleFunction.SampleFunctions;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomePage extends SampleFunctions {
    public HomePage(AppiumDriver driver) {
        super(driver);

    }
    public void AcceptConfirm()
    {
        clickElement(By.id("frPrivacy_btnAccept"));
    }
    public void ClickBuyTicket()
    {
        clickElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Turkish Airlines\"]"));
        clickElement(By.xpath("//android.widget.RelativeLayout[3]"));
    }

}
