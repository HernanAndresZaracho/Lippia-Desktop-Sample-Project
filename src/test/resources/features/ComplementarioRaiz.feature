Feature: Raiz de un numero en base a otro

  #Tuve un error al entrar al menu
  #Me daba un error de ambiguedad
  #Pero de igual manera se puede resolver el feature
  @Smoke
    Scenario Outline: Raiz de un numero en base a otro
    And Seleccionamos el <numero>
    And Seleccionamos la funcion raiz cuadrada
    Then El resultado es <resultado>

    Examples:
      | numero | resultado |
      | 81     | 9         |