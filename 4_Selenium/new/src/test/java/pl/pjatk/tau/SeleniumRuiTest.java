package pl.pjatk.tau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class SeleniumRuiTest {

    public WebDriver driver;

    @BeforeAll
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void quit() {
        driver.quit();
    }

    @Test
    public void testInitialiseChecker() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        assertEquals("Web form", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value);
    }

    @Test
    public void webGuiTests() {

        driver.get("http://localhost:4200");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("TEST");

        //test sign in password
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("TESTx2");

        driver.findElement(ByAngular.buttonText("logowanie")).click();

        //come back
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(ByAngular.buttonText("Wstecz")).click();

        //test sign up login
        driver.findElement(ByAngular.buttonText("rejestracja")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='login']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("TEST");


        //test sign up password
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("TESTx2");


        //test sign up password repeat
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='powtorz haslo']")).sendKeys("TESTx2");

        //test sign up name
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='imie']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='imie']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='imie']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='imie']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='imie']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='imie']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='imie']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='imie']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='imie']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='imie']")).sendKeys("TEST");

        //test sign up surname
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwisko']")).sendKeys("TEST");

        //test sign up age
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='wiek']")).sendKeys("1");

        //man/woman
        Select sel = new Select(driver.findElement(By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']")));
        sel.selectByVisibleText("kobieta");
        sel.selectByVisibleText("mezczyzna");


        //test sign up phone code
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='48']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='48']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='48']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='48']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='48']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='48']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='48']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='48']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='48']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='48']")).sendKeys("11");

        //test sign up phone
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='123456789']")).sendKeys("123456789");

        //test sign up email
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='example@domain.com']")).sendKeys("example@domain.pl");

        //test sign up street
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='ulica posesji']")).sendKeys("TEST");

        //test sign up street number
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer domu']")).sendKeys("1");

        //test sign up flat number
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='numer mieszkania']")).sendKeys("1");

        //test sign up city
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='miejscowosc']")).sendKeys("TEST");

        //test sign up postal code
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='00-000']")).sendKeys("11-111");

        //test sign up country
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys("");
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys("   ");
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys("zażółćgęśląjaźń");
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys("   aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys("   aąAĄ0");
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys("aąAĄ0  ");
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys(" :>?<:{}!@#$%^&*()_,.  ';[]+=- ");
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='nazwa kraju']")).sendKeys("TEST");

        //register user
        driver.findElement(ByAngular.buttonText("rejestracja")).click();
        driver.findElement(ByAngular.buttonText("wstecz")).click();

        //login user
        driver.findElement(By.xpath("//input[@placeholder='login']")).sendKeys("TEST");
        driver.findElement(By.xpath("//input[@placeholder='haslo']")).sendKeys("TESTx2");

        System.out.println("appropriate end of program");


        new WebDriverWait(driver, Duration.ofMillis(100));
        driver.quit();
    }



}