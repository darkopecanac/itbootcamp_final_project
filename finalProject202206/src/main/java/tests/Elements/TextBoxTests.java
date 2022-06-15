package tests.Elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TextBoxTests extends BaseTest {

  @Test
  public void verifySubmittingTextBoxForm() {
    getHomePage().openElementsSection();
    getHomePage().selectTexBox();
    Assert.assertTrue(getTextBoxPage().verifySubmittingTextBoxForm(
            "Marko Markovic",
            "marko@markovic.com",
            "Street 1",
            "Street 2"));
  }
}