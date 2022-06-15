package tests.Elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CheckBoxTests extends BaseTest {

  @Test
  public void verifyCheckBoxSelectionFunctionality() {
    getHomePage().openElementsSection();
    getHomePage().selectCheckBox();
    Assert.assertTrue(getCheckBoxPage().verifyAllCheckBoxesSelection());
  }
}