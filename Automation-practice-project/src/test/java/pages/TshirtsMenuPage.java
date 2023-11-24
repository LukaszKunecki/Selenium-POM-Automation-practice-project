package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TshirtsMenuPage {

    public TshirtsMenuPage(WebElement driver) {
        PageFactory.initElements(driver, this);
    }
}
