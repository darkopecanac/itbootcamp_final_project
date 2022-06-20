package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTests extends BaseTest {

  @BeforeMethod
  public void beforeMethod() {

    getHomePage().openHomePage();
  }

  /**
   * Test Case ID: TC_HP_S_001 (Look at the documentation in Test Plan.xlsx)
   * Verifies that Elements section is opened.
   */
  @Test (priority = 1)
  public void verifyOpeningElementsSectionFunctionality() {

    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getElements()));
  }

  /**
   * Test Case ID: TC_HP_S_002 (Look at the documentation in Test Plan.xlsx)
   * Verifies that Elements section is opened.
   */
  @Test (priority = 2)
  public void verifyOpeningFormsSectionFunctionality() {

    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getForms()));
  }

  /**
   * Test Case ID: TC_HP_S_003 (Look at the documentation in Test Plan.xlsx)
   * Verifies that Elements section is opened.
   */
  @Test (priority = 3)
  public void verifyOpeningAlertsFrameWindowsSectionFunctionality() {

    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getAlertsFrameWindows()));
  }

  /**
   * Test Case ID: TC_HP_S_004 (Look at the documentation in Test Plan.xlsx)
   * Verifies that Elements section is opened.
   */
  @Test (priority = 4)
  public void verifyOpeningWidgetsSectionFunctionality() {

    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getWidgets()));
  }

  /**
   * Test Case ID: TC_HP_S_005 (Look at the documentation in Test Plan.xlsx)
   * Verifies that Elements section is opened.
   */
  @Test (priority = 5)
  public void verifyOpeningInteractionsSectionFunctionality() {

    Assert.assertTrue(getHomePage().verifyOpenedSection(getHomePage().getInteractions()));
  }

  /**
   * Test Case ID: TC_HP_S_006 (Look at the documentation in Test Plan.xlsx)
   * Verifies that Elements section is opened.
   */
  @Test (priority = 6)
  public void verifyOpeningBookStoreApplicationSectionFunctionality() {

    JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
    jsExecutor.executeScript("window.scrollBy(0,800)");

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