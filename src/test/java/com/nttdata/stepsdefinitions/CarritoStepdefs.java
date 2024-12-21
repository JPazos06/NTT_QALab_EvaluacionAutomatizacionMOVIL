package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class CarritoStepdefs {

    @Steps
    CarritoSteps objCarrito;
    @Given("estoy en la aplicacion de SauceLabs")
    public void estoy_en_la_aplicacion_de_SauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        objCarrito.validarCarga();
    }

    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String UNIDADES, String PRODUCTO) {
        objCarrito.irAProducto(PRODUCTO);
        objCarrito.agregarCantidad(UNIDADES, PRODUCTO);
        Assert.assertEquals(UNIDADES, objCarrito.validarAgregarProductos());
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        objCarrito.validarCarrito();
    }
}
