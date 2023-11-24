package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MenuBarPage {

    public MenuBarPage(WebElement driver) {
        PageFactory.initElements(driver, this);
    }
}
