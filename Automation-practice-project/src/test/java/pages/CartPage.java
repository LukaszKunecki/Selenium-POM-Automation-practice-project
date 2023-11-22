package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage(WebElement driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "shopping_cart")
    WebElement cart;

}
