package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmPurchase {
    public static final Target TXT_PURCHASE = Target.the("Confirmar orden")
            .located(By.xpath("//h2[text()='Thank you for your purchase!']"));
}
