package simpleStart.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import simpleStart.pages.GeneralPage;
import io.cucumber.java.en.Given;


public class GeneralPageSteps {
    GeneralPage generalPage = new GeneralPage();

    @Given("Open DemoQA site with endpoint {string}")
    public void openDemoQASiteOnMainPageWithEndpoint(String endpoint) {
        generalPage.openDemoQASite(endpoint);
    }

    @And("Main page DemoQA is open")
    public void mainPageDemoQAIsOpen() {
        generalPage.mainPageDemoQAOpened();
    }

    @When("I click to card {string}")
    public void iClickToCard(String cardName) {
        generalPage.iClickToCard(cardName);
    }
}