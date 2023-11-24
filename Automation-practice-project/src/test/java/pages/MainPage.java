package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebElement driver) {
        PageFactory.initElements(driver, this);
    }

}
