package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class TextBoxPage extends BasePage {

  private By fullName = By.id("userName");
  private By email = By.id("userEmail");
  private By currentAddress = By.id("currentAddress");
  private By permanentAddress = By.id("permanentAddress");
  private By submit = By.id("submit");

  public TextBoxPage(WebDriver driver, WebDriverWait driverWait) {

    super(driver, driverWait);
  }

  /**
   * Submits Text Box form
   * @param fullName
   * @param email
   * @param currentAddress
   * @param permanentAddress
   */
  public void submitTextBoxForm(String fullName, String email, String currentAddress, String permanentAddress) {

    getDriver().findElement(this.fullName).sendKeys(fullName);
    getDriver().findElement(this.email).sendKeys(email);
    getDriver().findElement(this.currentAddress).sendKeys(currentAddress);
    getDriver().findElement(this.permanentAddress).sendKeys(permanentAddress);

    getDriver().findElement(this.submit).click();
  }

  /**
   * Verifies that Text Box form is submitted.
   * @param fullName
   * @param email
   * @param currentAddress
   * @param permanentAddress
   * @return true if form is submitted.
   */
  public boolean verifySubmittingTextBoxForm(String fullName, String email, String currentAddress, String permanentAddress) {

    submitTextBoxForm(fullName, email, currentAddress, permanentAddress);

    boolean checkFullName = getDriver().findElement(By.xpath("//*[@id='output']/div/p[1]")).getText().contains(fullName);
    boolean checkEmail = getDriver().findElement(By.xpath("//*[@id='output']/div/p[2]")).getText().contains(email);
    boolean checkCurrentAddress = getDriver().findElement(By.xpath("//*[@id='output']/div/p[3]")).getText().contains(currentAddress);
    boolean checkPermanentAddress = getDriver().findElement(By.xpath("//*[@id='output']/div/p[4]")).getText().contains(permanentAddress);

    return ( checkFullName && checkEmail && checkCurrentAddress && checkPermanentAddress );
  }
}