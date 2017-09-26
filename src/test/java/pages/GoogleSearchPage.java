package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by DSizov on 26.09.2017.
 */
@DefaultUrl("https://www.google.ru/")
public class GoogleSearchPage extends PageObject{

    @FindBy(css = "#lst-ib")
    WebElement searchField;

    @FindBy(css = "input[value = 'Поиск в Google']")
    WebElement searchButton;

    @FindBy(linkText = "Интернет-бухгалтерия «Моё дело»")
    WebElement moeDeloLink;

    public void search(String searchQuery) {
        searchField.sendKeys(searchQuery);
        waitFor(searchButton).isVisible();
        searchButton.click();
    }

    public void openMoeDeloPromo() throws InterruptedException {
        waitFor(moeDeloLink).isVisible();
        moeDeloLink.click();
        Thread.sleep(5000);
    }

}
