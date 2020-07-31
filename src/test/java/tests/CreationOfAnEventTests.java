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
//    Thread.sleep(2000);
//    wd.findElement(By.xpath("//*[@data-selenium='form-event-name']")).sendKeys("AuthoTest");
//    wd.findElement(By.xpath("//*[@name='title']")).sendKeys("AuthoTest");
//    Thread.sleep(5000);
//    wd.findElement(By.xpath("//*[@class='tox-edit-area']")).click();
//    wd.findElement(By.xpath("//*[@class='tox-edit-area']")).sendKeys("Test");
        ////div[@class='styles__Column-sc-1aza7k4-3 fnsUcJ']//div[@class='react-select__value-container css-1hwfws3']

        wd.findElement(By.name("event_category")).sendKeys(randCells.getRandomCategoryTagAgeLimit(1));  //нужен List....тут не происходит входа в категории
//        Thread.sleep(1000);                                                                           // эта трока выдает рандом категорий : randCells.getRandomCategoryTagAgeLimit(1) цифра в параметрах 1- категории
                                                                                                        // 2 - теги 3 - ограничения (возвращает String не int)
        wd.findElement(By.name("event_category")).sendKeys(Keys.ENTER);

        wd.findElement(By.name("title")).sendKeys("Selenium");

        wd.findElement(By.name("tags")).sendKeys(randCells.getRandomCategoryTagAgeLimit(2));  //нужен List     randCells.getRandomCategoryTagAgeLimit(2)
        Thread.sleep(1000);
        wd.findElement(By.name("tags")).sendKeys(Keys.ENTER);

        wd.findElement(By.className("tox-edit-area")).click();
        wd.findElement(By.cssSelector(".tox-edit-area iframe")).sendKeys("kek");

//        Select restriction = new Select(wd.findElement(By.name("restriction")));
//        restriction.selectByIndex(1);

        wd.findElement(By.name("restriction")).click();
        Thread.sleep(5000);
        wd.findElement(By.xpath("//*[@name='restriction']//*[contains(text(), '0+')]")).click();  // нужен List  не понимаю куда свой код ставить это выражение вернет число ранд в стринг виде :  randCells.getRandomCategoryTagAgeLimit(3)

        wd.findElement(By.xpath("//*[@data-selenium='create-continue-button']")).click();




        Thread.sleep(10000);

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
