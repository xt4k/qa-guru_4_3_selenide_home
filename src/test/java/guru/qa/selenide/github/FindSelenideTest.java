package guru.qa.selenide.github;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindSelenideTest {

    @Disabled
    @Test
    void shouldFindSelenideInGitHub() {
        // открыть страничку гитхаб
        open("https://github.com");
        // ввести в поле поиска selenide
        // нажать enter
        $("[name=q]").setValue("selenide").pressEnter();
        // выбрать первый найденый проект из списка
        //$$("ul.repo-list li").first().$("a").click();
        $("ul.repo-list li a").click();
        // проверка: в заголовке встречается selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));
    }

}
