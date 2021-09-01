package simpleStart.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;

public class PracticeFormPage {
    public void iEnterInTheField(String inputData, String fieldName) {
       $x("//input[@id='" + fieldName + "']").setValue(inputData).pressEnter();
    }

    public void selectRadioButtonFemale(String fieldName) {
        $x("//input[@value='" + fieldName + "']").closest("div").click();
    }

    public void iEnterOnTheFieldSubject(String inputData) {
        $x("//div[@id='subjectsContainer']//input").setValue(inputData).pressEnter();
    }

    public void iClickButton(String buttonName) {
        $x("//button[contains(text(),'Close')]").click();
    }

    public void popUpIsOpenWithTitle(String title) {
        $x("//div[@class='modal-header']//div").shouldHave(Condition.text(title));
    }
}
