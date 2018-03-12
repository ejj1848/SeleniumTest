package com.bt.vote;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ResumeTest {


    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("http://resume.aston.prod.com/login?logout");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("resume");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("qwe123$!");
        driver.findElement(By.xpath("//input[@value='Login Now']")).click();
        driver.findElement(By.linkText("Build Full Resume")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Applicant Info')]")).click();
        driver.findElement(By.id("fullName")).click();
        driver.findElement(By.id("fullName")).clear();
        driver.findElement(By.id("fullName")).sendKeys("Eric Johnson");
        driver.findElement(By.id("emailAddress")).clear();
        driver.findElement(By.id("emailAddress")).sendKeys("ejohnson@astontech.com");
        driver.findElement(By.id("phoneNum")).click();
        driver.findElement(By.id("phoneNum")).clear();
        driver.findElement(By.id("phoneNum")).sendKeys("123-456-7891");
        driver.findElement(By.id("Dob")).click();
        driver.findElement(By.id("Dob")).clear();
        driver.findElement(By.id("Dob")).sendKeys("0001-04-16");
        driver.findElement(By.id("Dob")).clear();
        driver.findElement(By.id("Dob")).sendKeys("0019-04-16");
        driver.findElement(By.id("Dob")).clear();
        driver.findElement(By.id("Dob")).sendKeys("0198-04-16");
        driver.findElement(By.id("Dob")).clear();
        driver.findElement(By.id("Dob")).sendKeys("1989-04-16");
        driver.findElement(By.xpath("//div[@id='profile6']/div/div[2]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Work History')]")).click();
        driver.findElement(By.id("eng1-Months")).clear();
        driver.findElement(By.id("eng1-Months")).sendKeys("1");
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).clear();
        driver.findElement(By.id("eng1-Months")).sendKeys("2");
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).clear();
        driver.findElement(By.id("eng1-Months")).sendKeys("3");
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).clear();
        driver.findElement(By.id("eng1-Months")).sendKeys("8");
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).clear();
        driver.findElement(By.id("eng1-Months")).sendKeys("9");
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).clear();
        driver.findElement(By.id("eng1-Months")).sendKeys("10");
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).clear();
        driver.findElement(By.id("eng1-Months")).sendKeys("11");
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng1-Months")).clear();
        driver.findElement(By.id("eng1-Months")).sendKeys("12");
        driver.findElement(By.id("eng1-Months")).click();
        driver.findElement(By.id("eng2-Months")).click();
        driver.findElement(By.id("eng2-Months")).clear();
        driver.findElement(By.id("eng2-Months")).sendKeys("14");
        driver.findElement(By.id("eng3-Months")).click();
        driver.findElement(By.id("eng3-Months")).clear();
        driver.findElement(By.id("eng3-Months")).sendKeys("14");
        driver.findElement(By.xpath("//form[@id='fullResume']/fieldset")).click();
        driver.findElement(By.linkText("Technologies")).click();
        driver.findElement(By.linkText("Data Center")).click();
        driver.findElement(By.id("1")).click();
        driver.findElement(By.id("1")).clear();
        driver.findElement(By.id("1")).sendKeys("1");
        driver.findElement(By.name("techMix[0].SubTechs")).click();
        driver.findElement(By.xpath("//input[@value='Generate']")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}


