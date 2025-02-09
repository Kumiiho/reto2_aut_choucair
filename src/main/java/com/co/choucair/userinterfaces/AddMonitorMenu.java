package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddMonitorMenu {
    public static final Target OP_MONITORS = Target.the("Acceder al modal de monitores")
            .located(By.xpath("//a[text()='Monitors']"));
    public static final Target MONITOR = Target.the("Monitor")
            .located(By.xpath("//a[text()='Apple monitor 24']"));
    public static final Target BTN_ADDCART = Target.the("Boton añadir carro")
            .located(By.xpath("//a[text()='Add to cart']"));
}

