package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtsMenuPage {

    public TshirtsMenuPage(WebElement driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="layered_id_attribute_group_1")
    WebElement sizeS;
}
