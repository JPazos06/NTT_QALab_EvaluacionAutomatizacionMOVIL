package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductosScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement quantityButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement productLabel;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement cartButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement quantityLabel;

    public void agregarCantidad(String UNIDADES, String PRODUCTO){
        if(PRODUCTO.equals(productLabel.getText()) && Integer.parseInt(UNIDADES) > 2){
            for(int i = 1; i <= Integer.parseInt(UNIDADES); i++){
                quantityButton.click();
            }
            cartButton.click();
        } else{
          cartButton.click();
        }
    }
    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(productLabel));
        return productLabel.isEnabled();
    }

    public String validarAgregarProducto(){
        return quantityLabel.getText();
    }
}
