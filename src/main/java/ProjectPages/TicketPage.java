package ProjectPages;

import SampleFunction.SampleFunctions;
import com.opencsv.CSVWriter;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class TicketPage extends SampleFunctions {
    public TicketPage(AppiumDriver driver) {
        super(driver);
    }

    public void OneWay() throws IOException {

        clickElement(By.id("frDashboard_tvOneWay"));
        CSVWriter writer =new CSVWriter(new FileWriter("fly.cvc"));
        String flydirect = driver.findElement(By.id("frDashboard_tvOneWay")).getText();
        writer.writeNext(new String[]{flydirect});
        writer.close();
    }
    public void ChooseDirection(String from, String to) {
        clickElement(By.id("frDashboard_tvFromCode"));
        sendKeysValue(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"), from);
        clickElement(By.xpath("//android.widget.TextView[2]"));
        clickElement(By.id("frDashboard_tvToCode"));
        sendKeysValue(By.id("frAirportSelection_etSearch"),to);
        clickElement(By.xpath("//android.widget.TextView[2]"));
    }
    public void SelectDate() {
        clickElement(By.id("frDashboard_rlDeparture"));
        clickElement(By.xpath("//android.view.ViewGroup[5]/android.widget.FrameLayout[7]/android.widget.TextView"));
    }
    public void clickedOkey() {
        clickElement(By.id("frDashboard_btnDone"));
    }

    public void addPerson() {
        clickElement(By.xpath("//android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView"));
    }

    public void SearchFly() {
        clickElement(By.id("frDashboard_btnSearch"));
    }

    public int TicketList() {
       int values =  getElementsByXpath("//android.view.ViewGroup").size();
       return values;
    }
    public void ChooseTicket()
    {
        clickElement(By.xpath("//android.view.ViewGroup/android.view.ViewGroup"));
        clickElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]"));
    }
    public void goClick()
    {
        clickElement(By.id("frFlightSearch_btnContinue"));
    }
}
