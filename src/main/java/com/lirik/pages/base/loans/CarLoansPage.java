package com.lirik.pages.base.loans;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.lirik.pages.base.BasePage;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class CarLoansPage extends BasePage {

    public final SelenideElement tabAgreementsButton = $x("//a[@href='/auto-credit/my']/div");

    public CarLoansPage selectAgreementsTab(SelenideElement element) {
        tabAgreementsButton.shouldBe(Condition.visible).click();
        return this;
    }
}
