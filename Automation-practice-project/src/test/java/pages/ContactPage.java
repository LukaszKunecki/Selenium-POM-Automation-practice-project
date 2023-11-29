package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.WatchEvent;

public class ContactPage {

    @FindBy(id = "id_contact")
    WebElement subjectHeading;

    @FindBy(id ="email")
    WebElement emailField;

    @FindBy(id = "id_order")
    WebElement orderReference;

    @FindBy(id = "uniform-fileUpload")
    WebElement attachment;

    @FindBy(id = "submitMessage")
    WebElement submit;
}
