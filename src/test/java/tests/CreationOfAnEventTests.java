package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CreationOfAnEventTests extends TestBase {


    @Test
    public void testCreationEvent() throws Exception {

        wd.findElement(By.xpath("//*[@title='Мероприятия']")).click();
        wd.findElement(By.xpath("//*[@data-selenium='button-new-event']")).click();
        wd.findElement(By.xpath("//*[@data-selenium='form-event-name']")).click();
        Thread.sleep(20000);
//    wd.findElement(By.xpath("//*[@data-selenium='form-event-name']")).sendKeys("AuthoTest");
        wd.findElement(By.xpath("//*[@name='title']")).sendKeys("AuthoTest");

//        open("https://dash.portalbilet.vvpd.ru/login");
//        $(By.name("username")).sendKeys("Test_user_772@mail.com");
//        $(By.name("password")).sendKeys("Test_user_772@mail.com");
//        $(By.xpath("//div[@id='app_layout']/div[2]/div/div[2]/div/form/div[2]/div/button/span")).click();
//    Thread.sleep(4000);
//    $(By.xpath("(//*[@data-selenium='sidebar-events']")).click();
//    $(By.xpath("(//span[@class='styles__Icon-sc-1g4on5e-1 hGTdFW']//img)")).click();
//        $(By.xpath("//*[@title='Мероприятия']")).click();
//        $(By.xpath("//*[@data-selenium='button-new-event']")).click();
//        Thread.sleep(20000);
//        $(By.xpath("//*[@data-selenium='select-event_category']")).click();
//	    $(By.xpath("data-selenium='select-event_category'")).sendKeys(Keys.ENTER);
//	private WebElement webElement;
//        $(By.xpath("//*[@class='react-select__value-container css-1hwfws3']")).setValue("Акции");

    }

}
