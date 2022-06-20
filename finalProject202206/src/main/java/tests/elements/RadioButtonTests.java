package tests.elements;

import org.testng.Assert;
import org.testng.annotations.*;
import tests.BaseTest;

public class RadioButtonTests extends BaseTest {

  @BeforeMethod
  public void beforeMethod() {

    getHomePage().openSection(getHomePage().getElements());
    getElementsPage().selectRadioButtonSubSection();
  }

  /**
   * Test Case ID: TC_E_R_001 (Look at the documentation in Test Plan.xlsx)
   * Verifies that all check boxes are selected.
   */
  @Test (priority = 1)
  public void verifyYesRadioButtonSelectionFunctionality() throws InterruptedException {

    Assert.assertTrue(getRadioButtonPage().verifyYesRadioButtonSelection());
  }

  /**
   * Test Case ID: TC_E_R_002 (Look at the documentation in Test Plan.xlsx)
   * Verifies that only Private check box is selected.
   */
  @Test (priority = 2)
  public void verifyImpressiveRadioButtonSelectionFunctionality() {

    Assert.assertTrue(getRadioButtonPage().verifyImpressiveRadioButtonSelection());
  }
}