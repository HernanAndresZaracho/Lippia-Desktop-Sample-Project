Feature: Operaciones basicas de numeros enteros positivos menores a 10

  Background:
    Given Estamos en la aplicacion correcta

  @Smoke @Operaciones
    Scenario Outline: Operaciones de 2 numeros enteros
    When <operacion> de el primer <numero1> y el segundo <numero2>
    Then El resultado es <resultado>

    Examples:
      | operacion | numero1 | numero2 | resultado |
      | plus      | 90      | 10      | 100       |
      | minus     | 9       | 7       | 2         |
      | multiply  | 9       | 4       | 36        |
      | divide    | 8       | 8       | 1         |