package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddCelMenu {
    public static final Target OP_PHONE = Target.the("Acceder al modal de monitores")
            .located(By.xpath("//a[text()='Phones']"));
    public static final Target PHONE = Target.the("Monitor")
            .located(By.xpath("//a[text()='Iphone 6 32gb']"));
    public static final Target BTN_ADDCART_PHONE = Target.the("Boton añadir carro")
            .located(By.xpath("//a[text()='Add to cart']"));
}
