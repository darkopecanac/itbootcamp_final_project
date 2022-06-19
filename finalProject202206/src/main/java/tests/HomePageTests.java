package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class HomePageTests extends BaseTest {

//  private By homepage = By.id("//*[@id='app']/header/a");
//  private By elements = By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]");
//  private By forms = By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]");
//  private By alertsFrameWindows = By.xpath("//*[@id='app']/div/div/div[2]/div/div[3]");
//  private By widgets = By.xpath("//*[@id='app']/div/div/div[2]/div/div[4]");
//  private By interactions = By.xpath("//*[@id='app']/div/div/div[2]/div/div[5]");
//  private By bookStoreApplication = By.xpath("//*[@id='app']/div/div/div[2]/div/div[6]");

  @BeforeMethod
  public void beforeMethod() {
    getHomePage().openHomePage();
  }

  @Test (priority = 1)
  public void verifyOpeningElementsSection() {
//    getHomePage().openSection(getHomePage().getElements());
    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getElements()));
  }

  @Test (priority = 2)
  public void verifyOpeningFormsSection() {
//    getHomePage().openSection(getHomePage().getForms());
    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getForms()));
  }

  @Test (priority = 3)
  public void verifyOpeningAlertsFrameWindowsSection() {
//    getHomePage().openSection(getHomePage().getAlertsFrameWindows());
    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getAlertsFrameWindows()));
  }

  @Test (priority = 4)
  public void verifyOpeningWidgetsSection() {
//    getHomePage().openSection(getHomePage().getWidgets());
    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getWidgets()));
  }

  @Test (priority = 5)
  public void verifyOpeningInteractionsSection() {
//    getHomePage().openSection(getHomePage().getInteractions());
    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getInteractions()));
  }

  @Test (priority = 6)
  public void verifyOpeningBookStoreApplicationSection() {

    JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
    jsExecutor.executeScript("window.scrollBy(0,800)");

//    getHomePage().openSection(getHomePage().getBookStoreApplication());
    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getBookStoreApplication()));
  }

//  @Test (priority = 1)
//  public void verifyOpeningElementsSection() {
//    getHomePage().openElementsSection();
//  }
//
//  @Test (priority = 2)
//  public void verifyOpeningFormsSection() {
//    getHomePage().openFormsSection();
//  }
//
//  @Test (priority = 3)
//  public void verifyOpeningAlertsFrameWindowsSection() {
//    getHomePage().openAlertsFrameWindowsSection();
//  }
//
//  @Test (priority = 4)
//  public void verifyOpeningWidgetsSection() {
//    getHomePage().openWidgetsSection();
//  }
//
//  @Test (priority = 5)
//  public void verifyOpeningInteractionsSection() {
//    getHomePage().openInteractionsSection();
//  }
//
//  @Test (priority = 6)
//  public void verifyOpeningBookStoreApplicationSection() {
//
//    JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
//    jsExecutor.executeScript("window.scrollBy(0,500)");
//
//    getHomePage().openBookStoreApplicationSection();
//  }
}