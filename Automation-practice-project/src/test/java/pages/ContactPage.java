package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

    @FindBy(id = "id_contact")
    WebElement subjectHeading;

    @FindBy(id ="email")
    WebElement emailField;
}
