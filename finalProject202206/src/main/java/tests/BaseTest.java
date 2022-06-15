package tests;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.Elements.CheckBoxPage;
import pages.Elements.TextBoxPage;
import pages.HomePage;

import java.time.Duration;

@Getter
public class BaseTest {

  private static final String HOME_URL = "https://demoqa.com/";
  private WebDriver driver;
  private WebDriverWait driverWait;

  private HomePage homePage;
  private TextBoxPage textBoxPage;
  private CheckBoxPage checkBoxPage;

  @BeforeClass
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();

    driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

    driver.navigate().to(HOME_URL);

    this.homePage = new HomePage(driver, driverWait);
    this.textBoxPage = new TextBoxPage(driver, driverWait);
    this.checkBoxPage = new CheckBoxPage(driver, driverWait);
  }

//  @AfterClass
//  public void afterClass() {
//    driver.close();
//  }
}