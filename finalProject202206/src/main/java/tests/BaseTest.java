package tests;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.HomePage;
import pages.elements.*;

import java.time.Duration;

@Getter
public class BaseTest {

  private WebDriver driver;
  private WebDriverWait driverWait;

  private HomePage homePage;
  private ElementsPage elementsPage;
  private TextBoxPage textBoxPage;
  private CheckBoxPage checkBoxPage;
  private RadioButtonPage radioButtonPage;

  private WebTablesPage webTablesPage;
  private ButtonsPage buttonsPage;

  @BeforeClass
  public void setUp() {

    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

    driver = new ChromeDriver();
    driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

    this.homePage = new HomePage(driver, driverWait);
    this.elementsPage = new ElementsPage(driver, driverWait);
    this.textBoxPage = new TextBoxPage(driver, driverWait);
    this.checkBoxPage = new CheckBoxPage(driver, driverWait);
    this.radioButtonPage = new RadioButtonPage(driver, driverWait);
    this.webTablesPage = new WebTablesPage(driver, driverWait);
    this.buttonsPage = new ButtonsPage(driver, driverWait);

    getHomePage().openHomePage();
    driver.manage().window().maximize();
  }

//  @AfterClass
//  public void afterClass() {
//
//    driver.close();
//  }
}