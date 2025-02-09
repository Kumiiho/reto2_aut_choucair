package com.co.choucair.task;

import com.co.choucair.models.BuyLombokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.BuyProducts.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class GoToCart implements Task {
    protected BuyLombokData buyLombokData;

    public GoToCart(BuyLombokData buyLombokData){
        this.buyLombokData = buyLombokData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ORDER),
                WaitUntil.the(TXT_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(buyLombokData.getName()).into(TXT_NAME),
                Enter.theValue(buyLombokData.getCountry()).into(TXT_COUNTRY),
                Enter.theValue(buyLombokData.getCity()).into(TXT_CITY),
                Scroll.to(TXT_CREDIT_CARD),
                Enter.theValue(buyLombokData.getCreditCard()).into(TXT_CREDIT_CARD),
                Enter.theValue(buyLombokData.getMonth()).into(TXT_MONTH),
                Enter.theValue(buyLombokData.getYear()).into(TXT_YEAR),
                Click.on(BTN_PURCHASE)
        );

    }
    public static GoToCart on(BuyLombokData buyLombokData){
        return Instrumented.instanceOf (GoToCart.class).withProperties(buyLombokData);
    }
}
