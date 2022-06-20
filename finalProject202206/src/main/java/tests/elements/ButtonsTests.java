package tests.elements;

import org.testng.Assert;
import org.testng.annotations.*;
import tests.BaseTest;

public class ButtonsTests extends BaseTest {

  @BeforeMethod
  public void BeforeMethod() {

    getHomePage().openSection(getHomePage().getElements());
    getElementsPage().selectButtonsSubSection();
  }

  /**
   * Test Case ID: TC_E_B_001 (Look at the documentation in Test Plan.xlsx)
   * Verifies that after double-click on the button there is a message displayed.
   */
  @Test (priority = 1)
  public void verifyDoubleClickButtonFunctionality() {

    Assert.assertTrue(getButtonsPage().verifyDoubleClickMeButton());
  }

  /**
   * Test Case ID: TC_E_B_002 (Look at the documentation in Test Plan.xlsx)
   * Verifies that after right-click on the button there is a message displayed.
   */
  @Test (priority = 2)
  public void verifyRightClickButtonFunctionality() {

    Assert.assertTrue(getButtonsPage().verifyRightClickMeButton());
  }

  /**
   * Test Case ID: TC_E_B_003 (Look at the documentation in Test Plan.xlsx)
   * Verifies that after click on the button with dynamically changed id
   * there is a message displayed.
   */
  @Test (priority = 3)
  public void verifyDynamicallyChangedButtonIdClickFunctionality() {

    Assert.assertTrue(getButtonsPage().verifyDynamicClickMeButton());
  }
}