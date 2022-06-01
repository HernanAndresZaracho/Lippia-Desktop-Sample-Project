package com.crowdar.examples.constants;

public class CalculatorConstants {
    private CalculatorConstants() {}
	// NUMBERS
    public static final String NUMBER = "XPATH://*[@AutomationId='num%sButton']";
    
    //OPERATIONS
    public static final String OPERATION = "XPATH://*[@AutomationId='%sButton']";
    public static final String EQUAL = "XPATH://*[@AutomationId='equalButton']";

    //DISPLAY
    public static final String CALCULATOR_RESULTS = "XPATH://*[@AutomationId='CalculatorResults']";
    public static final String MENU = "XPATH://*[@AutomationId=\"TogglePaneButton\"]";
    public static final String MPLUS = "XPATH://*[@AutomationId=\"MemPlus\"]";
    public static final String MRECORD = "XPATH://*[@AutomationId=\"MemRecall\"]";
    public static final String SCIENTIFIC = "XPATH://*[@AutomationId=\"Scientific\"]";
    public static final String RAIZ = "XPATH://*[@AutomationId=\"squareRootButton\"]";
}