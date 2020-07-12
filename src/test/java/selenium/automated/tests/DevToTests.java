package selenium.automated.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class DevToTests {

    WebDriver driver;

    @Before
    public void SetUp(){

        System.setProperty("webdriver.chrome.driver", "c://SeleniumWebdriver//chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test
    public void FirstTest(){

        String url = "https://dev.to/";
        driver.get(url);


        String curentUrl = driver.getCurrentUrl();

        assertTrue("The current URL isn't dev.to!",url.equals(curentUrl));


    }

    @Test
    public void weekclick(){

        String url = "https://dev.to/top/week";
        driver.get(url);


        String curentUrl = driver.getCurrentUrl();

        //assertTrue("The current URL isn't dev.to!",url.equals(curentUrl));

        driver.findElement(By.xpath("//*[@id=\"on-page-nav-controls\"]/div/nav/a[2]")).click();
        String curentUrl2 = driver.getCurrentUrl();

        assertTrue("The current URL isn't dev.to!",url.equals(curentUrl2));


    }

    @Test
    public void searchclick(){

        String url = "https://dev.to/";
        driver.get(url);



        //assertTrue("The current URL isn't dev.to!",url.equals(curentUrl));

        driver.findElement(By.id("nav-search")).sendKeys("java");
        driver.findElement(By.id("nav-search")).sendKeys(Keys.ENTER);

        String curentUrl2 = driver.getCurrentUrl();

        String curentUrl = driver.getCurrentUrl();

        //assertTrue("The current URL isn't dev.to!",url.equals(curentUrl2));

        //driver.close();


    }



}
