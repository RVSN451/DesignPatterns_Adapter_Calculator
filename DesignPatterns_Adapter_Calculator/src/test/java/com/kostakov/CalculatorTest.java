package com.kostakov;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class CalculatorTest  {

    private double value1 = 2;
    private double value2 = 3;


    @Test
    public void testNewFormula_AcceptOperand1() {

        Calculator calc = Mockito.mock(Calculator.class);
        Mockito.when(calc.newFormula())
                .thenReturn(new Calculator.Formula()
                        .addOperand(value1));

        Calculator.Formula expected = new Calculator.Formula();
        Calculator.Formula preferences = calc.newFormula();

        Assertions.assertNotEquals(expected.a, preferences.a);
    }

    @Test
    public void testNewFormula_NotChangedOperand2() {

        Calculator calc = Mockito.mock(Calculator.class);
        Mockito.when(calc.newFormula())
                .thenReturn(new Calculator.Formula()
                        .addOperand(value1));

        Calculator.Formula expected = new Calculator.Formula();
        Calculator.Formula preferences = calc.newFormula();

        Assertions.assertEquals(expected.b, preferences.b);
    }

    @Test
    public void testFormulaIsCorrect() {

        Calculator calc = Mockito.mock(Calculator.class);
        Mockito.when(calc.newFormula())
                .thenReturn(new Calculator.Formula()
                        .addOperand(value1)
                        .addOperand(value2)
                        .calculate(Calculator.Operation.MULT)
                );

        double expected = 6;
        Calculator.Formula preferences = calc.newFormula();

        Assertions.assertEquals(expected, preferences.result);
    }


}
