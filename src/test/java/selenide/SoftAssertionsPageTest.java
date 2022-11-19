package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsPageTest {

    @Test
    void shouldBeSoftAssertionsPage() {
        //open selenide repo in github
        open("https://github.com/selenide/selenide");

        //go to Wiki page of project
        $("#wiki-tab").click();

        //check SoftAssertions page and open
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box .wiki-more-pages", 1).shouldHave(text("SoftAssertions")).click();

        //check JUnit5 code
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
