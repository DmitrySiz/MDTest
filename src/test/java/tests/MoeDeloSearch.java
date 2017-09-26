package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.MoeDeloSearchSteps;

/**
 * Created by DSizov on 26.09.2017.
 */
@RunWith(SerenityRunner.class)
public class MoeDeloSearch {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    MoeDeloSearchSteps moeDeloSearchSteps;

    @Test
    public void moeDeloSearchByGoogle() throws InterruptedException {
        moeDeloSearchSteps.openGooglePage();
        moeDeloSearchSteps.searchByGoogle("Мое дело");
        moeDeloSearchSteps.openMoeDeloPromoPage();
        moeDeloSearchSteps.checkUrl();
        moeDeloSearchSteps.checkButton();
    }
}
