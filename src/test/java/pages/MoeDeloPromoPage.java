package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by DSizov on 26.09.2017.
 */
@DefaultUrl("https://www.moedelo.org/")
public class MoeDeloPromoPage extends PageObject{

    @FindBy(css = "a.login-elem")
    WebElement loginButton;

    public boolean isLoginButtonExist(){
        return loginButton.isDisplayed();
    }
}
