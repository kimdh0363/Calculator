package operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    private final char operator;
    Operator(char inputOperator) {
        this.operator = inputOperator;
    }

    private final static List<Operator> operators = new ArrayList<Operator>();
    static {
        operators.addAll(Arrays.asList(values()));
    }

    public Operator checkOperator(char inputOperator) {
        Operator currentOperator = null;
        for (int i = 0; i < operators.size(); i++) {
            if (operators.get(i).operator == inputOperator) {
                currentOperator = operators.get(i);
            }
        }
        return currentOperator;

    }

};
