package com.lirik;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

@ExtendWith(Listener.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SelenideFirstTest {

    @Test
    void test() {
        open("https://google.com/уку"); // Так в Selenide мы запускаем браузер и идем по URL

        /**
         * Ниже приведен способ поиска элементов на странице. Мы создали SelenideElement и теперь можем совершать над ним операции
         */

        SelenideElement searchLibeElement = $x("//input[@name='q']");

        searchLibeElement.setValue("Hello from JAVA"); // Так в Selenide мы отправляем текст для заполнения (аналог sendKeys в Selenium)

        searchLibeElement.pressEnter(); // Так в Selenide ым нажимаем Enter (аналог submit в Selenium)

        SelenideElement resultSearchElement = $x("//div[@id='result-stats']");

        resultSearchElement.shouldBe(Condition.visible); // Так в Selenide мы осуществляем проверки
    }
}
