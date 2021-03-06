package guru.qa.selenide.github;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindContributors {

    @Disabled
    @Test
    void firstContributorShouldBeSolntsev() {

        open("https://github.com/selenide/selenide");

        SelenideElement blockContributers = $(".BorderGrid")
                .$(byText("Contributors"));
        blockContributers.closest("div")
                .$("ul li").hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

    }

}
