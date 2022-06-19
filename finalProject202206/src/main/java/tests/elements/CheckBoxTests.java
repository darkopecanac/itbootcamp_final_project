package tests.elements;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CheckBoxTests extends BaseTest {

  @BeforeMethod
  public void beforeMethod() {
    getHomePage().openSection(getHomePage().getElements());
    getElementsPage().selectCheckBox();
  }

  @Test
  public void verifyAllCheckBoxesSelectionFunctionality() {
//    getHomePage().openElementsSection();
//    getHomePage().openSection(getHomePage().getElements());
//    getElementsPage().selectCheckBox();
    Assert.assertTrue(getCheckBoxPage().verifyAllCheckBoxesSelection());
  }

  @Test
  public void verifyPrivateCheckBoxSelectionFunctionality() {
//    getHomePage().openElementsSection();
//    getHomePage().openSection(getHomePage().getElements());
//    getElementsPage().selectCheckBox();
    Assert.assertTrue(getCheckBoxPage().verifyPrivateCheckBoxesSelection());
  }
}