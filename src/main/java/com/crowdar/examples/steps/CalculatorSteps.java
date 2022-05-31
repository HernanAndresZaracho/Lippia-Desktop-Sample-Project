package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("^Hacemos la (.*) de el primer (.*) y el segundo (.*)$")
    public void sumamosElPrimerNumeroYElSegundoNumero(String ope, String num1, String num2) {
        CalculatorService.operaciones(ope, num1, num2);
    }

    @Then("^El resultado es (.*)$")
    public void elResultadoEsResultado(int resul) {
        CalculatorService.result(resul);
    }

    @When("Hacemos la <operacion> de el primer <numero{int}> y el segundo <numero{int}>")
    public void hacemosLaOperacionDeElPrimerNumeroYElSegundoNumero(int arg0, int arg1) {
    }
}
