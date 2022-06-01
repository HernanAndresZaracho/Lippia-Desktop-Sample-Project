package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("^(.*) de el primer (.*) y el segundo (.*)$")
    public void sumamosElPrimerNumeroYElSegundoNumero(String ope, String num1, String num2) {
        CalculatorService.operaciones(ope, num1, num2);
    }

    @Then("^El resultado es (.*)$")
    public void elResultadoEsResultado(int resul) {
        CalculatorService.result(resul);
    }

    @And("Guardamos el resultado")
    public void guardamosElResultado() {
        CalculatorService.clickMplus();
    }

    @And("Buscamos en la memoria el resultado")
    public void buscamosEnLaMemoriaElResultado() {
        CalculatorService.clickMR();
    }


    @And("^Seleccionamos el (.*)$")
    public void seleccionamosElNumero(int num) {
        CalculatorService.clickear(String.valueOf(num));
    }

    @And("Seleccionamos la funcion raiz cuadrada")
    public void seleccionamosLaFuncionRaizCuadrada() {
        CalculatorService.clickRaiz();
    }
}
