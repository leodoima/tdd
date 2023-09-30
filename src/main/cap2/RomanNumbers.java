package main.cap2;

import javax.naming.NoInitialContextException;

public class RomanNumbers {

    public int translateRomanNumbers(String expression) {
        int accumulator = 0;
        int lastNumber = 0;
        int expressionVerification = 1;

        for (int i = expression.length() - 1; i >= 0; i--) {

            int actual = RomanValuesEnum.valueOf(String.valueOf(expression.charAt(i))).getIntergerValue();

            expressionVerification = (lastNumber > actual) ? -1 : 1;

            accumulator += actual * expressionVerification;
            lastNumber = actual;
        }

        return accumulator;
    }
}
