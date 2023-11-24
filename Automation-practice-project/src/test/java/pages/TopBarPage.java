package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TopBarPage {

    public TopBarPage(WebElement driver) {
        PageFactory.initElements(driver, this);
    }
}
