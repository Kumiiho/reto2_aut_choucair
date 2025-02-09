package com.co.choucair.stepdefinitions;

import com.co.choucair.task.AddCartCel;
import com.co.choucair.task.AddCartMonitor;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.*;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

import static com.co.choucair.utils.Constants.*;

public class PurchaseValueStepDefinitions {
    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void close() {
        SerenityWebdriverManager.inThisTestThread().clearCurrentActiveDriver();
        SerenityWebdriverManager.inThisTestThread().closeCurrentDriver();
    }
    @Given("El usuario accede al website")
    public void elUsuarioAccedeAlWebsite() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }
    @When("Añadir al carrito un monitor")
    public void añadirAlCarritoUnMonitorMonitor() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddCartMonitor.on()
        );
    }
    @When("Añadir al carrito un celular")
    public void añadirAlCarritoUnCelularCelular() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddCartCel.on()
        );
    }
    @When("Realizar un pedido")
    public void realizarUnPedido() {

    }
    @Then("Revisar el precio del pedido")
    public void revisarElPrecioDelPedido() {

    }

}
