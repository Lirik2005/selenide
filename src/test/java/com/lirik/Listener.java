package com.lirik;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

/**
 * Данный класс предназначен для работы со скриншотами.
 */

@Slf4j
public class Listener implements TestWatcher {

    @Override
    @Attachment (value = "Attachment Screenshot", type = "image/png")
    public void testFailed(ExtensionContext context, Throwable cause) {

        Configuration.reportsFolder = "build/allure-results/screenshots/";

        log.info("Test {} failed ", (context.getTestMethod().get().getName()));
        String screenshotName = context.getTestMethod().get().getName() + String.valueOf(System.currentTimeMillis()).substring(9, 13);

        log.info("Try to trace screenshot... ");



        Selenide.screenshot(screenshotName);


    }
}
