package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BlueRentalPage;
import utilities.Driver;

public class BlueRentalStepDefinitions {
    BlueRentalPage blueRentalPage = new BlueRentalPage();


    @Given("kullanici ana sayfada")
    public void kullanici_ana_sayfada() {
        Driver.getDriver().get("https://www.bluerentalcars.com/");


    }
    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {
        blueRentalPage.loginGiris.click();

    }
    @When("kullanıcı adini {string} girer")
    public void kullanıcı_adini_girer(String string) {
        blueRentalPage.email.sendKeys(string);

    }
    @When("sifreyi {string} girer")
    public void sifreyi_girer(String string) {
        blueRentalPage.password.sendKeys(string);

    }
    @When("login buttoning basar")
    public void login_buttoning_basar() {
        blueRentalPage.loginButton.click();

    }
    @Then("login islemi gerçekleşir")
    public void login_islemi_gerçekleşir() {


    }

}
