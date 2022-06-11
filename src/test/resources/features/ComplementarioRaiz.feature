Feature: Raiz de un numero en base a otro

  Background:
    Given Estamos en la aplicacion correcta

  @Smoke @Raiz
    Scenario Outline: Raiz de un numero en base a otro
    And Seleccionamos el <numero>
    And Seleccionamos la funcion raiz cuadrada
    Then El resultado es <resultado>

    Examples:
      | numero | resultado |
      | 81     | 9         |