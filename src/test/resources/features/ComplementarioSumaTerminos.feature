Feature: Suma de terminos que se multiplican
  COMO usuario de la aplicación calculadora
  QUIERO usar la funcionalidad de M+ en la calculadora estándar
  PARA sumar el producto de 3 pares de valores.

  Background:
    Given Estamos en la aplicacion correcta

  @Smoke @SumaTerminos
    Scenario Outline: Suma de terminos que se multiplican
    When <operacion> de el primer <numero1> y el segundo <numero2>
    And Guardamos el resultado
    And <operacion> de el primer <numero3> y el segundo <numero4>
    And Guardamos el resultado
    And <operacion> de el primer <numero5> y el segundo <numero6>
    And Guardamos el resultado
    And Buscamos en la memoria el resultado
    Then El resultado es <resultado>

    Examples:
      | operacion | numero1 | numero2 | numero3 | numero4 | numero5 | numero6 | resultado |
      | multiply  | 10      | 4       | 4       | 90      | 56      | 2       | 512       |