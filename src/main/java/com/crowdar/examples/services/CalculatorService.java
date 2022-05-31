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
    public static void result(int resul){
    	Assert.assertEquals(getResult(),String.format(String.valueOf(resul)));
    }
    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("[a-zA-Z]+", "").trim();
    }

}