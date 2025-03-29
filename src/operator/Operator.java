package operator;

import java.util.ArrayList;
import java.util.List;

public enum Operator {
    PLUS('+') {
        @Override
        public double calculation(double num1, double num2) {
            return num1 + num2;
        }
    },
    MINUS('-') {
        @Override
        public double calculation(double num1, double num2) {
            return num1 - num2;
        }
    },
    MULTIPLY('*') {
        @Override
        public double calculation(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIVIDE('/') {
        @Override
        public double calculation(double num1, double num2) {
            return num1 / num2;
        }
    };
    abstract public double calculation(double num1, double num2);

    private final char inputOperator;
    Operator(char inputOperator) {
        this.inputOperator = inputOperator;
    }
    public char getOperator(char operator) {
        return inputOperator;
    }

    private final List<Operator> operators = new ArrayList<Operator>();
    static {
        for (int i = 0; i <1; i++) {

        }
    }

    public Operator checkOperator(char operator) {

        return MINUS;
    }

};
