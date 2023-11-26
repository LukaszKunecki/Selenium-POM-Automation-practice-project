package pages;

import org.junit.jupiter.api.ClassOrderer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopBarPage {

    public TopBarPage(WebElement driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "contact-link")
    WebElement contact;

    @FindBy(className = "header_user_info")
    WebElement signIn;
}
