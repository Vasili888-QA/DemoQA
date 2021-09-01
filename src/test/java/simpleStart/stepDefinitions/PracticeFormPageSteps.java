package simpleStart.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import simpleStart.pages.PracticeFormPage;

public class PracticeFormPageSteps {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @When("I enter {string} in the field {string}")
    public void iEnterInTheField(String inputData, String fieldName) {
        practiceFormPage.iEnterInTheField(inputData, fieldName);
    }

    @And("Select radio button {string}")
    public void selectRadioButtonFemale(String fieldName) {
        practiceFormPage.selectRadioButtonFemale(fieldName);
    }

    @And("I enter {string} on the field Subject")
    public void iEnterOnTheFieldSubject(String inputData) {
        practiceFormPage.iEnterOnTheFieldSubject(inputData);
    }

    @Then("I click button {string}")
    public void iClickButton(String buttonName) {
        practiceFormPage.iClickButton(buttonName);
    }

    @Then("Pop-up is open with title {string}")
    public void popUpIsOpenWithTitle(String title) {
        practiceFormPage.popUpIsOpenWithTitle(title);
    }
}
