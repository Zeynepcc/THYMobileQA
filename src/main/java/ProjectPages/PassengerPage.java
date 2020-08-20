package ProjectPages;

import SampleFunction.SampleFunctions;
import io.appium.java_client.AppiumDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PassengerPage extends SampleFunctions  {


    public PassengerPage(AppiumDriver driver) {
        super(driver);
    }

    public String  ReadToExcelConfig(int row , int cell) throws IOException {

        FileInputStream file =  new FileInputStream(new File("Info.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        String cellData = sheet.getRow(row).getCell(cell).getStringCellValue();
        System.out.println(cellData);
        return cellData;
    }
    public String ReadToExcelNumericConfig(int row , int cell) throws IOException {

        FileInputStream file =  new FileInputStream(new File("Info.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int cellData = (int) sheet.getRow(row).getCell(cell).getNumericCellValue();
        System.out.println(cellData);
        return String.valueOf(cellData);
    }
    public void fillPassengerone() throws IOException {

        clickElement(By.xpath("//android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]"));
        clickElement(By.id("frAddNewPassenger_etAddName"));
        sendKeysValue(By.id("frAddNewPassenger_etAddName"),ReadToExcelConfig(1,0));
        clickElement(By.id("frAddNewPassenger_etAddLastName"));
        sendKeysValue(By.id("frAddNewPassenger_etAddLastName"),ReadToExcelConfig(1,1));
        clickElement(By.id("form_checkbox_left"));
        clickElement(By.id("frAddNewPassenger_etAddDateOfBirth"));
        clickElement(By.id("datePickerBottom_ivDone"));
        clickElement(By.id("frAddNewPassenger_etAddEmail"));
        sendKeysValue(By.id("frAddNewPassenger_etAddEmail"),ReadToExcelConfig(1,2));
        clickElement(By.id("frAddNewPassenger_etAddFlyerNumber"));
        sendKeysValue(By.id("frAddNewPassenger_etAddFlyerNumber"),ReadToExcelNumericConfig(1,3));
        clickElement(By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox[1]"));
        sendKeysValue(By.id("frAddNewPassenger_etAddTCKN"),ReadToExcelNumericConfig(1,4));
        clickElement(By.id("frAddNewPassenger_btnAddPassenger"));

    }
    public void secondpassenger() throws IOException {

        clickElement(By.xpath("android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));
        clickElement(By.xpath("android.widget.ExpandableListView/android.widget.RelativeLayout[5]/android.widget.RelativeLayout/android.widget.TextView[2]"));
        clickElement(By.id("frAddNewPassenger_etAddName"));
        sendKeysValue(By.id("frAddNewPassenger_etAddName"),ReadToExcelConfig(2,0));
        clickElement(By.id("frAddNewPassenger_etAddLastName"));
        sendKeysValue(By.id("frAddNewPassenger_etAddLastName"),ReadToExcelConfig(2,1));
        clickElement(By.id("form_checkbox_left"));
        clickElement(By.id("frAddNewPassenger_etAddDateOfBirth"));
        clickElement(By.id("datePickerBottom_ivDone"));
        clickElement(By.id("frAddNewPassenger_etAddEmail"));
        sendKeysValue(By.id("frAddNewPassenger_etAddEmail"),ReadToExcelConfig(2,2));
        clickElement(By.id("frAddNewPassenger_etAddFlyerNumber"));
        sendKeysValue(By.id("frAddNewPassenger_etAddFlyerNumber"),ReadToExcelNumericConfig(2,3));
        clickElement(By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox[1]"));
        sendKeysValue(By.id("frAddNewPassenger_etAddTCKN"),ReadToExcelNumericConfig(2,4));
        clickElement(By.id("frAddNewPassenger_btnAddPassenger"));

    }
    public void PassengerContinue()
    {
        clickElement(By.id("frPickPassenger_btnContinue"));
    }
}
