package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}

	public static void operaciones(String ope,String num1, String num2) {
        clickear(num1);
    	ActionManager.click(String.format(CalculatorConstants.OPERATION, ope));
        clickear(num2);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    public static void result(String resul){
        Assert.assertEquals(getResult(),resul);
    }
    public static String getResult() {
        return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("[a-zA-Z]+", "").trim();
    }
    public static void clickear(String num){
        if(num.length() > 1){
            for(int i = 0; i < num.length();i++){
                ActionManager.click(String.format(CalculatorConstants.NUMBER, num.charAt(i)));
            }
        }
        else{
            ActionManager.click(String.format(CalculatorConstants.NUMBER, num));
        }
    }
    public static void clickMplus(){
        ActionManager.click(CalculatorConstants.MPLUS);
    }
    public static void clickMR(){
        ActionManager.click(CalculatorConstants.MRECORD);
    }
    public static void clickRaiz(){
        ActionManager.click(CalculatorConstants.RAIZ);
    }
}
