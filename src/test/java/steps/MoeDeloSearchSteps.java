package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.GoogleSearchPage;
import pages.MoeDeloPromoPage;

/**
 * Created by DSizov on 26.09.2017.
 */
public class MoeDeloSearchSteps extends ScenarioSteps {

    GoogleSearchPage googleSearchPage;
    MoeDeloPromoPage moeDeloPromoPage;

    private String moeDeloPromoPageUrl = "https://www.moedelo.org/";

    @Step("Open Google page")
    public void openGooglePage(){
        googleSearchPage.open();
    }

    @Step("Search by google")
    public void searchByGoogle(String query){
        googleSearchPage.search(query);
    }

    @Step("Open Moe Delo promo page")
    public void openMoeDeloPromoPage() throws InterruptedException {
        googleSearchPage.openMoeDeloPromo();
    }

    @Step("Check Moe Delo promo page url")
    public void checkUrl(){
        Assert.assertEquals(getDriver().getCurrentUrl(),moeDeloPromoPageUrl);
    }

    @Step("Check that  button login exist")
    public void checkButton(){
        Assert.assertTrue(moeDeloPromoPage.isLoginButtonExist());
    }
}
