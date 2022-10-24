package com.lirik.pages.base.telecomunications;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.lirik.pages.base.BasePage;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.$x;

@Getter
@Slf4j
public class MobilePhonePaymentPage extends BasePage {

    private final SelenideElement phoneNumberInput = $x("//input[@data-qa-node='phone-number']");
    private final SelenideElement amountForPaymentInput = $x("//input[@data-qa-node='amount']");
    private final SelenideElement walletButton = $x("//div[text()='My wallet']");
    private final SelenideElement cardForPaymentInput = $x("//input[@data-qa-node='numberdebitSource']");
    private final SelenideElement validationTermInput = $x("//input[@data-qa-node='expiredebitSource']");
    private final SelenideElement cvvCodeInput = $x("//input[@data-qa-node='cvvdebitSource']");
    private final SelenideElement submitAddToCartButton = $x("//button[@data-qa-node='submit']");
    private final SelenideElement paymentDetails = $x("//div[@data-qa-node='details']");


    public MobilePhonePaymentPage clickMyWalletButton(SelenideElement walletButtonLocator) {
        try {
            walletButtonLocator.shouldBe(Condition.visible).click();
        } catch (Exception e) {
            log.error("я упал: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return this;
    }

    public MobilePhonePaymentPage enterPhoneNumber(SelenideElement phoneNumberLocator, String phoneNumber) {
        phoneNumberLocator.shouldBe(Condition.visible).setValue(phoneNumber);
        return this;
    }

    public MobilePhonePaymentPage enterAmountForPayment(SelenideElement amountForPaymentLocator, String amountForPayment) {
        amountForPaymentLocator.shouldBe(Condition.visible).clear();
        amountForPaymentLocator.setValue(amountForPayment);
        return this;
    }

    public MobilePhonePaymentPage enterCardForPayment(SelenideElement cardForPaymentLocator, String cardNumber) {
        cardForPaymentLocator.shouldBe(Condition.visible).setValue(cardNumber);
        return this;
    }

    public MobilePhonePaymentPage enterValidationTerm(SelenideElement validationTermLocator, String validationTerm) {
        validationTermLocator.shouldBe(Condition.visible).setValue(validationTerm);
        return this;
    }

    public MobilePhonePaymentPage enterCvvCode(SelenideElement cvvCodeLocator, String cvvCode) {
        cvvCodeLocator.shouldBe(Condition.visible).setValue(cvvCode);
        return this;
    }

    public MobilePhonePaymentPage clickSubmitAddToCartButton(SelenideElement submitAddToCartLocator) {
        submitAddToCartLocator.shouldBe(Condition.visible).click();
        return this;
    }

    public MobilePhonePaymentPage checkPaymentDetails(SelenideElement paymentDetailsLocator) {
        paymentDetailsLocator.shouldBe(Condition.visible);
        return this;
    }
}
