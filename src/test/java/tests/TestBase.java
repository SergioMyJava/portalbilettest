package tests;

import appmanager.AutocompleteCells;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver wd;
    private String baseUrl;
    protected AutocompleteCells randCells;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
      System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
      wd = new FirefoxDriver();
        //Set Browser window size
      wd.manage().window().maximize();
      wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      baseUrl = "https://dash.portalbilet.vvpd.ru";
      wd.get(baseUrl);
      login("Test_user_772@mail.com", "Test_user_772@mail.com");
        randCells = new AutocompleteCells();
    }

    private void login(String username, String password) {
      wd.findElement(By.name("username")).clear();
      wd.findElement(By.name("username")).sendKeys(username);
      wd.findElement(By.name("password")).clear();
      wd.findElement(By.name("password")).sendKeys(password);
      wd.findElement(By.xpath("//div[@id='app_layout']/div[2]/div/div[2]/div/form/div[2]/div/button/span")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
      wd.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }
}
