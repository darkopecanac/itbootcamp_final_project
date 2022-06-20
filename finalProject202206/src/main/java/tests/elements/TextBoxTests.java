package tests.elements;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TextBoxTests extends BaseTest {

  private String fullName = "Marko Markovic";
  private String email = "marko@markovic.com";
  private String emailInvalid = "marko@markovic.444";
  private String currentAddress = "Street 1";
  private String permanentAddress = "Street 2";

  @BeforeMethod
  public void beforeMethod() {

    getHomePage().openSection(getHomePage().getElements());
    getElementsPage().selectTexBoxSubSection();
  }

  /**
   * Test Case ID: TC_E_T_001 (Look at the documentation in Test Plan.xlsx)
   * Verifies that Text Box form with valid data is submitted.
   */
  @Test (priority = 1)
  public void verifySubmittingTextBoxFormFunctionality() {

    Assert.assertTrue(getTextBoxPage().verifySubmittingTextBoxForm(
            fullName, email, currentAddress, permanentAddress));
  }

  /**
   * Test Case ID: TC_E_T_002 (Look at the documentation in Test Plan.xlsx)
   * Verifies that Text Box form with invalid data (.444 in mail domain)
   * is not submitted.
   */
  @Test (priority = 2)
  public void verifyNotSubmittingTextBoxFormWithInvalidDataFunctionality() {

    Assert.assertFalse(getTextBoxPage().verifySubmittingTextBoxForm(
            fullName, emailInvalid, currentAddress, permanentAddress));
  }
}