package operator;

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


    private final char inputOperator;
    Operator(char inputOperator) {
        this.inputOperator = inputOperator;
    }
    public char getOperator(char operator) {
        return inputOperator;
    }
    abstract public double calculation(double num1, double num2);
};
