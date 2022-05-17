package model;

public class Calculator {

    public static float calculator(float firstOperand, float secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand == 0) {
                    throw new RuntimeException("Error");
                } else
                    return firstOperand / secondOperand;
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
