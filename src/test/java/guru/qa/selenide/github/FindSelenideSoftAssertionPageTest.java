package guru.qa.selenide.github;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FindSelenideSoftAssertionPageTest {

    @DisplayName("Selenide Soft Assertion Test. qa-guru 4-3 home work")
    @Test
    void shouldFindSelenideInGitHub() {
        open("https://github.com/selenide/selenide");
        $("span[data-content='Wiki']").click();
        $$("#wiki-pages-box a").last()
                .shouldHave(text("SoftAssertions"))
                .click();
        for (SelenideElement se : $$("ol"))
            se.shouldHave(text("JUnit5"));
        $("ol[start='3']").shouldHave(text("Using JUnit5 extend test class:"))
                .sibling(0)
                .shouldHave(attribute("class", "highlight highlight-source-java"));
    }
}