import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UnimedCoop1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void unimedCoop1() {
    driver.get("https://www.unimed.coop.br/site/");
    driver.manage().window().setSize(new Dimension(952, 706));
    driver.findElement(By.id("fragment-oimm-link")).click();
    driver.findElement(By.id("react-tabs-2")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".css-1jvgh0k-control:nth-child(2) > .css-1hwfws3"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("react-select-3-option-4"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".row:nth-child(3) .css-dyr6gj-container")).click();
    driver.findElement(By.id("react-select-3-option-46")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".Select--invalid-field > .css-1hwfws3"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("react-select-4-option-2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("province-input")).click();
    driver.findElement(By.id("\"react-tabs-2\"")).click();
    driver.findElement(By.cssSelector(".css-1jvgh0k-control:nth-child(2) > .css-1hwfws3")).click();
    js.executeScript("window.scrollTo(0,386)");
    driver.findElement(By.id("react-select-5-option-67")).click();
    driver.findElement(By.cssSelector(".Button")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".Button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("html")).click();
  }
}
