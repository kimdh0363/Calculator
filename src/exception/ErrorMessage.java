package exception;

public enum ErrorMessage {
    IS_NULL("입력값이 NULL입니다."),
    IS_EMPTY("입력값이 비어있습니다."),
    INPUT_MINUS("입력값이 음수입니다."),
    INPUT_DECIMAL("입력값이 소수입니다."),
    ZERO_DIVISION("0으로 나눌 수 없습니다"),
    FRONT_SPACE("공백은 연산자 앞에만 올 수 있습니다."),
    MORE_SPACE("공백이 2개 이상입니다."),
    CONTINUOUS_SEPARATOR("구분자가 연속으로 올 수 없습니다."),
    WRONG_SEPARATOR("유효한 구분자가 아닙니다."),
    WRONG_OPERATOR("유효한 연산자가 아닙니다."),
    MORE_OPERATOR("연산자는 1개만 입력 가능합니다.")
    ;


    private final String errorMessage;

    ErrorMessage(String message) {
        errorMessage = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
