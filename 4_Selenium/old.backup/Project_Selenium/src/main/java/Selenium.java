import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Selenium

{

    static int id = 1;

    public static void main(String[] args)

    {

        System.setProperty("webdriver.chrome.driver", "Project_Selenium/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for angular
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        NgWebDriver ngDriver = new NgWebDriver(jsDriver);
        ngDriver.waitForAngularRequestsToFinish();

        //ng serve cmd
        driver.get("http://localhost:4200");

        //test sign in login
        driver.findElement(By.id("selenium_login")).sendKeys("test");
        driver.findElement(By.id("selenium_login")).clear();
        driver.findElement(By.id("selenium_login")).sendKeys("12345");
        driver.findElement(By.id("selenium_login")).clear();
        driver.findElement(By.id("selenium_login")).sendKeys("");
        driver.findElement(By.id("selenium_login")).clear();
        driver.findElement(By.id("selenium_login")).sendKeys("   ");
        driver.findElement(By.id("selenium_login")).clear();
        driver.findElement(By.id("selenium_login")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_login")).clear();
        driver.findElement(By.id("selenium_login")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_login")).clear();
        driver.findElement(By.id("selenium_login")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_login")).clear();
        driver.findElement(By.id("selenium_login")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_login")).clear();
        driver.findElement(By.id("selenium_login")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_login")).clear();
        driver.findElement(By.id("selenium_login")).sendKeys("TEST");

        //test sign in password
        driver.findElement(By.id("selenium_password")).sendKeys("test");
        driver.findElement(By.id("selenium_password")).clear();
        driver.findElement(By.id("selenium_password")).sendKeys("12345");
        driver.findElement(By.id("selenium_password")).clear();
        driver.findElement(By.id("selenium_password")).sendKeys("");
        driver.findElement(By.id("selenium_password")).clear();
        driver.findElement(By.id("selenium_password")).sendKeys("   ");
        driver.findElement(By.id("selenium_password")).clear();
        driver.findElement(By.id("selenium_password")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_password")).clear();
        driver.findElement(By.id("selenium_password")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_password")).clear();
        driver.findElement(By.id("selenium_password")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_password")).clear();
        driver.findElement(By.id("selenium_password")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_password")).clear();
        driver.findElement(By.id("selenium_password")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_password")).clear();
        driver.findElement(By.id("selenium_password")).sendKeys("TESTx2");

        driver.findElement(ByAngular.buttonText("logowanie")).click();

        //come back
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(ByAngular.buttonText("Wstecz")).click();

        //test sign up login
        driver.findElement(ByAngular.buttonText("rejestracja")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.id("selenium_loginForm")).sendKeys("test");
        driver.findElement(By.id("selenium_loginForm")).clear();
        driver.findElement(By.id("selenium_loginForm")).sendKeys("12345");
        driver.findElement(By.id("selenium_loginForm")).clear();
        driver.findElement(By.id("selenium_loginForm")).sendKeys("");
        driver.findElement(By.id("selenium_loginForm")).clear();
        driver.findElement(By.id("selenium_loginForm")).sendKeys("   ");
        driver.findElement(By.id("selenium_loginForm")).clear();
        driver.findElement(By.id("selenium_loginForm")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_loginForm")).clear();
        driver.findElement(By.id("selenium_loginForm")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_loginForm")).clear();
        driver.findElement(By.id("selenium_loginForm")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_loginForm")).clear();
        driver.findElement(By.id("selenium_loginForm")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_loginForm")).clear();
        driver.findElement(By.id("selenium_loginForm")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_loginForm")).clear();
        driver.findElement(By.id("selenium_loginForm")).sendKeys("TEST");


        //test sign up password
        //driver.findElement(ByAngular.buttonText("rejestracja")).click();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("selenium_passwdForm")).sendKeys("test");
        driver.findElement(By.id("selenium_passwdForm")).clear();
        driver.findElement(By.id("selenium_passwdForm")).sendKeys("12345");
        driver.findElement(By.id("selenium_passwdForm")).clear();
        driver.findElement(By.id("selenium_passwdForm")).sendKeys("");
        driver.findElement(By.id("selenium_passwdForm")).clear();
        driver.findElement(By.id("selenium_passwdForm")).sendKeys("   ");
        driver.findElement(By.id("selenium_passwdForm")).clear();
        driver.findElement(By.id("selenium_passwdForm")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_passwdForm")).clear();
        driver.findElement(By.id("selenium_passwdForm")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_passwdForm")).clear();
        driver.findElement(By.id("selenium_passwdForm")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_passwdForm")).clear();
        driver.findElement(By.id("selenium_passwdForm")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_passwdForm")).clear();
        driver.findElement(By.id("selenium_passwdForm")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_passwdForm")).clear();
        driver.findElement(By.id("selenium_passwdForm")).sendKeys("TESTx2");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#selenium_passwdRptForm")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys("123");
        
//        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//                try {
//             Thread.sleep(1000);
//        }  catch(Exception e) {
//            e.printStackTrace();
//        }


        //test sign up password repeat
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys("test");
        driver.findElement(By.id("selenium_passwdRptForm")).clear();
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys("12345");
        driver.findElement(By.id("selenium_passwdRptForm")).clear();
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys("");
        driver.findElement(By.id("selenium_passwdRptForm")).clear();
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys("   ");
        driver.findElement(By.id("selenium_passwdRptForm")).clear();
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_passwdRptForm")).clear();
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_passwdRptForm")).clear();
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_passwdRptForm")).clear();
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_passwdRptForm")).clear();
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_passwdRptForm")).clear();
        driver.findElement(By.id("selenium_passwdRptForm")).sendKeys("TESTx2");

        //test sign up name
        driver.findElement(By.id("selenium_name")).sendKeys("test");
        driver.findElement(By.id("selenium_name")).clear();
        driver.findElement(By.id("selenium_name")).sendKeys("12345");
        driver.findElement(By.id("selenium_name")).clear();
        driver.findElement(By.id("selenium_name")).sendKeys("");
        driver.findElement(By.id("selenium_name")).clear();
        driver.findElement(By.id("selenium_name")).sendKeys("   ");
        driver.findElement(By.id("selenium_name")).clear();
        driver.findElement(By.id("selenium_name")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_name")).clear();
        driver.findElement(By.id("selenium_name")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_name")).clear();
        driver.findElement(By.id("selenium_name")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_name")).clear();
        driver.findElement(By.id("selenium_name")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_name")).clear();
        driver.findElement(By.id("selenium_name")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_name")).clear();
        driver.findElement(By.id("selenium_name")).sendKeys("TEST");

        //test sign up surname
        driver.findElement(By.id("selenium_surname")).sendKeys("test");
        driver.findElement(By.id("selenium_surname")).clear();
        driver.findElement(By.id("selenium_surname")).sendKeys("12345");
        driver.findElement(By.id("selenium_surname")).clear();
        driver.findElement(By.id("selenium_surname")).sendKeys("");
        driver.findElement(By.id("selenium_surname")).clear();
        driver.findElement(By.id("selenium_surname")).sendKeys("   ");
        driver.findElement(By.id("selenium_surname")).clear();
        driver.findElement(By.id("selenium_surname")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_surname")).clear();
        driver.findElement(By.id("selenium_surname")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_surname")).clear();
        driver.findElement(By.id("selenium_surname")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_surname")).clear();
        driver.findElement(By.id("selenium_surname")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_surname")).clear();
        driver.findElement(By.id("selenium_surname")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_surname")).clear();
        driver.findElement(By.id("selenium_surname")).sendKeys("TEST");

        //test sign up age
        driver.findElement(By.id("selenium_age")).sendKeys("test");
        driver.findElement(By.id("selenium_age")).clear();
        driver.findElement(By.id("selenium_age")).sendKeys("12345");
        driver.findElement(By.id("selenium_age")).clear();
        driver.findElement(By.id("selenium_age")).sendKeys("");
        driver.findElement(By.id("selenium_age")).clear();
        driver.findElement(By.id("selenium_age")).sendKeys("   ");
        driver.findElement(By.id("selenium_age")).clear();
        driver.findElement(By.id("selenium_age")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_age")).clear();
        driver.findElement(By.id("selenium_age")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_age")).clear();
        driver.findElement(By.id("selenium_age")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_age")).clear();
        driver.findElement(By.id("selenium_age")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_age")).clear();
        driver.findElement(By.id("selenium_age")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_age")).clear();
        driver.findElement(By.id("selenium_age")).sendKeys("1");

        //man/woman
        driver.findElement(By.id("selenium_gender")).sendKeys("kobieta");
        driver.findElement(By.id("selenium_gender")).sendKeys("mezczyzna");


        //test sign up phone code
        driver.findElement(By.id("selenium_phoneCode")).sendKeys("test");
        driver.findElement(By.id("selenium_phoneCode")).clear();
        driver.findElement(By.id("selenium_phoneCode")).sendKeys("12345");
        driver.findElement(By.id("selenium_phoneCode")).clear();
        driver.findElement(By.id("selenium_phoneCode")).sendKeys("");
        driver.findElement(By.id("selenium_phoneCode")).clear();
        driver.findElement(By.id("selenium_phoneCode")).sendKeys("   ");
        driver.findElement(By.id("selenium_phoneCode")).clear();
        driver.findElement(By.id("selenium_phoneCode")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_phoneCode")).clear();
        driver.findElement(By.id("selenium_phoneCode")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_phoneCode")).clear();
        driver.findElement(By.id("selenium_phoneCode")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_phoneCode")).clear();
        driver.findElement(By.id("selenium_phoneCode")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_phoneCode")).clear();
        driver.findElement(By.id("selenium_phoneCode")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_phoneCode")).clear();
        driver.findElement(By.id("selenium_phoneCode")).sendKeys("11");

        //test sign up phone
        driver.findElement(By.id("selenium_phone")).sendKeys("test");
        driver.findElement(By.id("selenium_phone")).clear();
        driver.findElement(By.id("selenium_phone")).sendKeys("12345");
        driver.findElement(By.id("selenium_phone")).clear();
        driver.findElement(By.id("selenium_phone")).sendKeys("");
        driver.findElement(By.id("selenium_phone")).clear();
        driver.findElement(By.id("selenium_phone")).sendKeys("   ");
        driver.findElement(By.id("selenium_phone")).clear();
        driver.findElement(By.id("selenium_phone")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_phone")).clear();
        driver.findElement(By.id("selenium_phone")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_phone")).clear();
        driver.findElement(By.id("selenium_phone")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_phone")).clear();
        driver.findElement(By.id("selenium_phone")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_phone")).clear();
        driver.findElement(By.id("selenium_phone")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_phone")).clear();
        driver.findElement(By.id("selenium_phone")).sendKeys("123456789");

        //test sign up email
        driver.findElement(By.id("selenium_mail")).sendKeys("test");
        driver.findElement(By.id("selenium_mail")).clear();
        driver.findElement(By.id("selenium_mail")).sendKeys("12345");
        driver.findElement(By.id("selenium_mail")).clear();
        driver.findElement(By.id("selenium_mail")).sendKeys("");
        driver.findElement(By.id("selenium_mail")).clear();
        driver.findElement(By.id("selenium_mail")).sendKeys("   ");
        driver.findElement(By.id("selenium_mail")).clear();
        driver.findElement(By.id("selenium_mail")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_mail")).clear();
        driver.findElement(By.id("selenium_mail")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_mail")).clear();
        driver.findElement(By.id("selenium_mail")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_mail")).clear();
        driver.findElement(By.id("selenium_mail")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_mail")).clear();
        driver.findElement(By.id("selenium_mail")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_mail")).clear();
        driver.findElement(By.id("selenium_mail")).sendKeys("example@domain.pl");

        //test sign up street
        driver.findElement(By.id("selenium_street")).sendKeys("test");
        driver.findElement(By.id("selenium_street")).clear();
        driver.findElement(By.id("selenium_street")).sendKeys("12345");
        driver.findElement(By.id("selenium_street")).clear();
        driver.findElement(By.id("selenium_street")).sendKeys("");
        driver.findElement(By.id("selenium_street")).clear();
        driver.findElement(By.id("selenium_street")).sendKeys("   ");
        driver.findElement(By.id("selenium_street")).clear();
        driver.findElement(By.id("selenium_street")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_street")).clear();
        driver.findElement(By.id("selenium_street")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_street")).clear();
        driver.findElement(By.id("selenium_street")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_street")).clear();
        driver.findElement(By.id("selenium_street")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_street")).clear();
        driver.findElement(By.id("selenium_street")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_street")).clear();
        driver.findElement(By.id("selenium_street")).sendKeys("TEST");

        //test sign up street number
        driver.findElement(By.id("selenium_streetNum")).sendKeys("test");
        driver.findElement(By.id("selenium_streetNum")).clear();
        driver.findElement(By.id("selenium_streetNum")).sendKeys("12345");
        driver.findElement(By.id("selenium_streetNum")).clear();
        driver.findElement(By.id("selenium_streetNum")).sendKeys("");
        driver.findElement(By.id("selenium_streetNum")).clear();
        driver.findElement(By.id("selenium_streetNum")).sendKeys("   ");
        driver.findElement(By.id("selenium_streetNum")).clear();
        driver.findElement(By.id("selenium_streetNum")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_streetNum")).clear();
        driver.findElement(By.id("selenium_streetNum")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_streetNum")).clear();
        driver.findElement(By.id("selenium_streetNum")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_streetNum")).clear();
        driver.findElement(By.id("selenium_streetNum")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_streetNum")).clear();
        driver.findElement(By.id("selenium_streetNum")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_streetNum")).clear();
        driver.findElement(By.id("selenium_streetNum")).sendKeys("1");

        //test sign up flat number
        driver.findElement(By.id("selenium_flatNum")).sendKeys("test");
        driver.findElement(By.id("selenium_flatNum")).clear();
        driver.findElement(By.id("selenium_flatNum")).sendKeys("12345");
        driver.findElement(By.id("selenium_flatNum")).clear();
        driver.findElement(By.id("selenium_flatNum")).sendKeys("");
        driver.findElement(By.id("selenium_flatNum")).clear();
        driver.findElement(By.id("selenium_flatNum")).sendKeys("   ");
        driver.findElement(By.id("selenium_flatNum")).clear();
        driver.findElement(By.id("selenium_flatNum")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_flatNum")).clear();
        driver.findElement(By.id("selenium_flatNum")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_flatNum")).clear();
        driver.findElement(By.id("selenium_flatNum")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_flatNum")).clear();
        driver.findElement(By.id("selenium_flatNum")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_flatNum")).clear();
        driver.findElement(By.id("selenium_flatNum")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_flatNum")).clear();
        driver.findElement(By.id("selenium_flatNum")).sendKeys("1");

        //test sign up city
        driver.findElement(By.id("selenium_city")).sendKeys("test");
        driver.findElement(By.id("selenium_city")).clear();
        driver.findElement(By.id("selenium_city")).sendKeys("12345");
        driver.findElement(By.id("selenium_city")).clear();
        driver.findElement(By.id("selenium_city")).sendKeys("");
        driver.findElement(By.id("selenium_city")).clear();
        driver.findElement(By.id("selenium_city")).sendKeys("   ");
        driver.findElement(By.id("selenium_city")).clear();
        driver.findElement(By.id("selenium_city")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_city")).clear();
        driver.findElement(By.id("selenium_city")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_city")).clear();
        driver.findElement(By.id("selenium_city")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_city")).clear();
        driver.findElement(By.id("selenium_city")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_city")).clear();
        driver.findElement(By.id("selenium_city")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_city")).clear();
        driver.findElement(By.id("selenium_city")).sendKeys("TEST");

        //test sign up postal code
        driver.findElement(By.id("selenium_postalCode")).sendKeys("test");
        driver.findElement(By.id("selenium_postalCode")).clear();
        driver.findElement(By.id("selenium_postalCode")).sendKeys("12345");
        driver.findElement(By.id("selenium_postalCode")).clear();
        driver.findElement(By.id("selenium_postalCode")).sendKeys("");
        driver.findElement(By.id("selenium_postalCode")).clear();
        driver.findElement(By.id("selenium_postalCode")).sendKeys("   ");
        driver.findElement(By.id("selenium_postalCode")).clear();
        driver.findElement(By.id("selenium_postalCode")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_postalCode")).clear();
        driver.findElement(By.id("selenium_postalCode")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_postalCode")).clear();
        driver.findElement(By.id("selenium_postalCode")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_postalCode")).clear();
        driver.findElement(By.id("selenium_postalCode")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_postalCode")).clear();
        driver.findElement(By.id("selenium_postalCode")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_postalCode")).clear();
        driver.findElement(By.id("selenium_postalCode")).sendKeys("11-111");

        //test sign up country
        driver.findElement(By.id("selenium_country")).sendKeys("test");
        driver.findElement(By.id("selenium_country")).clear();
        driver.findElement(By.id("selenium_country")).sendKeys("12345");
        driver.findElement(By.id("selenium_country")).clear();
        driver.findElement(By.id("selenium_country")).sendKeys("");
        driver.findElement(By.id("selenium_country")).clear();
        driver.findElement(By.id("selenium_country")).sendKeys("   ");
        driver.findElement(By.id("selenium_country")).clear();
        driver.findElement(By.id("selenium_country")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.id("selenium_country")).clear();
        driver.findElement(By.id("selenium_country")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.id("selenium_country")).clear();
        driver.findElement(By.id("selenium_country")).sendKeys("   aąAĄ0");
        driver.findElement(By.id("selenium_country")).clear();
        driver.findElement(By.id("selenium_country")).sendKeys("aąAĄ0  ");
        driver.findElement(By.id("selenium_country")).clear();
        driver.findElement(By.id("selenium_country")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.id("selenium_country")).clear();
        driver.findElement(By.id("selenium_country")).sendKeys("TEST");

//       try {
//            screenshot();
//        }  catch(Exception e) {
//            e.printStackTrace();
//        }

        //register user
        driver.findElement(ByAngular.buttonText("rejestracja")).click();
        driver.findElement(ByAngular.buttonText("wstecz")).click();

        //login user
        driver.findElement(By.id("selenium_login")).sendKeys("TEST");
        driver.findElement(By.id("selenium_password")).sendKeys("TESTx2");

        System.out.println("appropriate end of program");


        new WebDriverWait(driver, 10);
        driver.quit();

    }

    public static void screenshot() throws IOException {

        WebDriver driver = new ChromeDriver();

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("E:\\__development\\TAU_2019\\zaliczenie_warunkowe\\lab_6_Selenium\\p_screens\\screen_" + id++ + "_.png"));
    }

}