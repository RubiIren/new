package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTests {
        @BeforeAll
        static void setup() {
            Configuration.startMaximized = true;
        }

        @Test
        void successfulSubmitFormTest() {

            open("https://demoqa.com/automation-practice-form");

            $("#firstName").setValue("Name");
            $("#lastName").setValue("Surname");
            $("#userEmail").setValue("podic58232@itwbuy.com");
            $("[for=gender-radio-2").click();
            $("#userNumber").setValue("8123456789");
            $("[id=state]").click();
            $("[id=react-select-3-option-0]").click();
            $("[id=city]").click();
            $("[id=react-select-4-option-0]").click();
            $("#submit").click();

            $(".table-responsive").shouldHave(text("Name Surname"),
                    text("podic58232@itwbuy.com"),text("Female"),
                    text("8123456789"), text("NCR Delhi"));

        }
    }

