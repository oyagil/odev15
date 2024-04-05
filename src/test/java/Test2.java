import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test2 {
    private WebDriver driver;

    @Before
    public void setUp() {
        // WebDriver'ı başlat
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testAddNewRecord() {
        driver.get("https://demoqa.com/webtables");

        // "Add" düğmesini bul ve tıkla
        WebElement addButton = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        addButton.click();

        // Yeni kayıt için gerekli alanları doldur
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameInput.sendKeys("Oya");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameInput.sendKeys("Demirtola");

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailInput.sendKeys("oyademirtola@gmail.com");

        WebElement ageInput = driver.findElement(By.xpath("//input[@id='age']"));
        ageInput.sendKeys("30");

        WebElement salaryInput = driver.findElement(By.xpath("//input[@id='salary']"));
        salaryInput.sendKeys("50000");

        WebElement departmentInput = driver.findElement(By.xpath("//input[@id='department']"));
        departmentInput.sendKeys("IT");

        // "Submit" düğmesini bul ve tıkla
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();



    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
