package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DressesMenuPage {

    public DressesMenuPage(WebElement driver){
        PageFactory.initElements(driver, this);
    }
}
