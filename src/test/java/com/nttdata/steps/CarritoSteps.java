package com.nttdata.steps;

import com.nttdata.screens.TiendaScreen;
import com.nttdata.screens.ProductosScreen;
import io.cucumber.messages.types.Product;
import org.junit.Assert;

public class CarritoSteps {

    TiendaScreen tiendaScreen;
    ProductosScreen productosScreen;

    public void validarCarga() {
        tiendaScreen.productoVisible();
    }

    public void irAProducto(String producto) {
        tiendaScreen.goToProduct(producto);
    }

    public void agregarCantidad(String unidades, String producto) {
        productosScreen.agregarCantidad(unidades, producto);
    }

    public String validarAgregarProductos() {
        return productosScreen.validarAgregarProducto();
    }

    public boolean validarCarrito() {
        return productosScreen.isProductDisplayed();
    }
}
