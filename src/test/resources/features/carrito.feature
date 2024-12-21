@test
  Feature: Tienda online

    @carrito
    Scenario Outline: carrito de compras
      Given estoy en la aplicacion de SauceLabs
      And valido que carguen correctamente los productos en la galeria
      When agrego "<UNIDADES>" del siguiente producto "<PRODUCTO>"
      Then valido el carrito de compra actualice correctamente
      Examples:
        | PRODUCTO                  | UNIDADES |
        | Sauce Labs Backpack       | 1        |
        | Sauce LAbs Bolt - T-Shirt | 1        |
        | Sauce Labs Bike Light     | 2        |