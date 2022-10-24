package com.lirik.pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    public final SelenideElement authWidget = $x("//iframe[@src='https://login-widget.privat24.ua/']");


    public void goToUrl(String url) {
        open(url);
    }

    public void isAuthWidgetPresent() {
        authWidget.shouldBe(Condition.visible);
    }
}
