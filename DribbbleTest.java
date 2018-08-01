package org.BetsolTraining;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class DribbbleTest {
    WebDriver driver = null;
    String application_url = "https://dribbble.com/";
    String signinXpath = "//*[@id=\"t-signin\"]/a";
    String signin_button = "//*[@id=\"form-oldschool\"]/form/input[3]";
    String search_button = "//*[@id=\"search\"]/input";
    String netguru = "//*[@id=\"screenshot-3951710\"]/h2/span[1]/a[1]";
    ObjectRepo obj_repo = null;
    int beforeCount = 0;


    @Before
    public void set_up()
    {
        System.out.println("executing before method" + (++beforeCount));
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resource/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        obj_repo = new ObjectRepo();
    }

    public WebElement findElement(By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = null;

        for (int retry_count = 0; retry_count < 3; retry_count++)
        {
            try {
                element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            }
            catch (NoSuchElementException e){
                System.out.println("Element not found Retrying for " + (retry_count + 1) + " time");
            }
            try {
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            }
            catch (ElementNotVisibleException e){
                System.out.println("Element not visible Retrying for " + (retry_count + 1) + " time");
            }
        }
        return element; }

    @Test
    public void dribbbleTest() throws InterruptedException
    {
        System.out.println("Google.dribbbleTest() :: Test Execution started");
        driver.get(application_url);
//            selectSource(source_city);
//            selectDestination(destination_city);
        findElement(obj_repo.signin_path).click();
        findElement(obj_repo.username).sendKeys("mayurls");
        findElement(obj_repo.password).sendKeys("m@yur253");

        findElement(obj_repo.signin_button).click();
        findElement(obj_repo.search).sendKeys("netguru");
        findElement(obj_repo.search).sendKeys(Keys.ENTER);
        findElement(obj_repo.netguru).click();
        findElement(obj_repo.follow_click).click();
Thread.sleep(7000);

        findElement(obj_repo.unfollow_click).click();
        Thread.sleep(1000);
        findElement(obj_repo.hover).click();
        findElement(obj_repo.logout_button).click();


        System.out.println("Google.dribbbleTest() :: Test Execution Completed");
    }



}
