package com.crowdar.examples.validator;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;
import org.testng.Assert;

import javax.swing.*;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class validator{

	private validator() {}

	public static void verificarAppCorrecta() {
        Assert.assertTrue(isVisible(CalculatorConstants.EQUAL));
    }
}
