#Autor: Andres Felipe Vargas Rey
#language:en

Feature: Test

  Scenario Outline: Valor de compra celular y monitor
    Given El usuario accede al website
    When Añadir al carrito un monitor
    When Añadir al carrito un celular
    When Realizar un pedido
      | name   | country   | city   | creditCard   | month   | year   |
      | <name> | <country> | <city> | <creditCard> | <month> | <year> |

    Then Revisar el precio del pedido

    Examples:
      | name | country  | city   | creditCard       | month | year |
      | Test | Colombia | Bogota | 4525933278704044 | 10    | 2026 |