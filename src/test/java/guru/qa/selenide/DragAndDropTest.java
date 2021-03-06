package guru.qa.selenide;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @Disabled
    @Test
    void shouldDragAontoB() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a header").shouldHave(text("A"));
        $("#column-b header").shouldHave(text("B"));


        // Hack that works on Chrome
        // Point b=$("#column-b").getLocation();
        //new Robot().mouseMove(b.getX()+100,b.getY()+200);

        //$("#column-a").dragAndDropTo($("#column-b"));

        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).perform();
        //actions().clickAndHold($("#column-a")).moveByOffset(200,0).release().perform();
        //sleep(3000);
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));

    }
}
