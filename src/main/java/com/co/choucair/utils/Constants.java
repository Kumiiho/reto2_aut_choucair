package com.co.choucair.utils;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Constants {
    public static final String URL = "https://www.demoblaze.com/index.html";
    public static final String ACTOR = "Actor";
    public static final Target HOME = Target.the("Boton home")
            .located(By.xpath("//a[text()='Home ']"));
    public static final Target CART = Target.the("Boton ir carrito")
            .located(By.xpath("//a[text()='Cart']"));
    public static final String CONFIRMPURCHASE = "Thank you for your purchase!";
}

