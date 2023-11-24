package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WomenMenuPage {

    public WomenMenuPage(WebElement driver) {
        PageFactory.initElements(driver, this);
    }
}
