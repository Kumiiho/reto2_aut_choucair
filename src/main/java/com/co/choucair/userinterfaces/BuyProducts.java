package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyProducts {
    public static final Target BTN_ORDER = Target.the("Boton tomar orden")
            .located(By.xpath("//button[text()='Place Order']"));
    public static final Target TXT_NAME = Target.the("Nombre comprador")
            .located(org.openqa.selenium.By.id("name"));
    public static final Target TXT_COUNTRY = Target.the("Nombre pais")
            .located(org.openqa.selenium.By.id("country"));
    public static final Target TXT_CITY = Target.the("Nombre ciudad")
            .located(org.openqa.selenium.By.id("city"));
    public static final Target TXT_CREDIT_CARD = Target.the("Numero Tarjeta credito")
            .located(org.openqa.selenium.By.id("card"));
    public static final Target TXT_MONTH = Target.the("Mes tarjeta credito")
            .located(org.openqa.selenium.By.id("month"));
    public static final Target TXT_YEAR = Target.the("Año tarjeta credito")
            .located(org.openqa.selenium.By.id("year"));
    public static final Target BTN_PURCHASE = Target.the("Boton compra")
            .located(By.xpath("//button[text()='Purchase']"));



}
