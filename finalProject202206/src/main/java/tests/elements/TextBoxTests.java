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
    getElementsPage().selectTexBox();
  }
  @Test (priority = 1)
  public void verifySubmittingTextBoxForm() {
//    getElementsPage().openElementsSection();
//    getHomePage().openSection(getHomePage().getElements());
//    getElementsPage().selectTexBox();
    Assert.assertTrue(getTextBoxPage().verifySubmittingTextBoxForm(
            fullName, email, currentAddress, permanentAddress));
  }

  @Test (priority = 2)
  public void verifyNotSubmittingTextBoxFormWithInvalidData() {
//    getElementsPage().openElementsSection();
//    getHomePage().openSection(getHomePage().getElements());
//    getElementsPage().selectTexBox();
    Assert.assertFalse(getTextBoxPage().verifySubmittingTextBoxForm(
            fullName, emailInvalid, currentAddress, permanentAddress));
  }
}