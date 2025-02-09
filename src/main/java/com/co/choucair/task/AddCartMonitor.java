package com.co.choucair.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.co.choucair.userinterfaces.AddMonitorMenu.*;
import static com.co.choucair.utils.Constants.HOME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddCartMonitor implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OP_MONITORS),
                WaitUntil.the(MONITOR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MONITOR),
                WaitUntil.the(BTN_ADDCART, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ADDCART),
                WaitUntil.the(ExpectedConditions.alertIsPresent()),
                Switch.toAlert().andAccept(),
                Click.on(HOME)
        );

    }

    public static AddCartMonitor on() {
        return Instrumented.instanceOf(AddCartMonitor.class).withProperties();
    }


}
