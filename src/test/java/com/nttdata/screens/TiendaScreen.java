package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TiendaScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement product1;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement product2;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement product3;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]")
    private WebElement productLabel;

    public void goToProduct(String producto){
        if(producto.equals(product1.getText())){
            product1.click();
        } else if(producto.equals(product2.getText())){
            product2.click();
        }else{
            product3.click();
        }
    }
    public boolean productoVisible(){
        waitFor(ExpectedConditions.visibilityOf(productLabel));
        return productLabel.isEnabled();
    }
}
