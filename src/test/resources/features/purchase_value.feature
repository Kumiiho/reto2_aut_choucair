#Autor: Andres Felipe Vargas Rey
#language:en

Feature: Test

  Scenario Outline: Valor de compra celular y monitor
    Given El usuario accede al website
    When Añadir al carrito un monitor <monitor>
    When Añadir al carrito un celular <celular>
    When Realizar un pedido
    Then Revisar el precio del pedido

    Examples:
      | <monitor>        | <celular>     |
      | Apple monitor 24 | Iphone 6 32gb |
