package tests.elements;

import org.testng.Assert;
import org.testng.annotations.*;
import tests.BaseTest;

public class CheckBoxTests extends BaseTest {

  @BeforeMethod
  public void beforeMethod() {

    getHomePage().openSection(getHomePage().getElements());
    getElementsPage().selectCheckBoxSubSection();
  }

  /**
   * Test Case ID: TC_E_C_001 (Look at the documentation in Test Plan.xlsx)
   * Verifies that all check boxes are selected.
   */
  @Test (priority = 1)
  public void verifyAllCheckBoxesSelectionFunctionality() {

    Assert.assertTrue(getCheckBoxPage().verifyAllCheckBoxesSelection());
  }

  /**
   * Test Case ID: TC_E_C_002 (Look at the documentation in Test Plan.xlsx)
   * Verifies that only Private check box is selected.
   */
  @Test (priority = 2)
  public void verifyPrivateCheckBoxSelectionFunctionality() {

    Assert.assertTrue(getCheckBoxPage().verifyPrivateCheckBoxesSelection());
  }
}