package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;


public class BaseTest {

    private static final String BASE_URL = "https://www.saucedemo.com/";
    private WebDriver driver;


    @BeforeAll
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupTest(){
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        assertThat(driver.getTitle()).isEqualTo(Utils.HOME_PAGE_TITTLE);
    }

    @AfterEach
    public void teardown(){
        if(driver != null){
            driver.quit();
        }
    }
}
