package com.co.choucair.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.co.choucair.userinterfaces.AddCelMenu.*;
import static com.co.choucair.utils.Constants.CART;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddCartCel implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OP_PHONE),
                Scroll.to(PHONE),
                WaitUntil.the(PHONE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PHONE),
                WaitUntil.the(BTN_ADDCART_PHONE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ADDCART_PHONE),
                WaitUntil.the(ExpectedConditions.alertIsPresent()),
                Switch.toAlert().andAccept(),
                Click.on(CART)
        );

    }

    public static AddCartCel on() {
        return Instrumented.instanceOf(AddCartCel.class).withProperties();
    }


}
