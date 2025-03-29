package characterValidator;

public enum CharacterValidator {
    COMMA(','),
    COLON(':'),
    SPACE(' '),
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVISION('/');

    private final char separator;

    CharacterValidator(char separator) {
        this.separator = separator;
    }

    public boolean isSeparator(char inputSeparator) {
        return inputSeparator == COMMA.separator || inputSeparator == COLON.separator;
    }
    public boolean isSpace(char inputSeparator) {
        return inputSeparator == separator;
    }
    public boolean isPlus(char inputSeparator) {
        return inputSeparator == separator;
    }
    public boolean isMinus(char inputSeparator) {
        return inputSeparator == separator;
    }
    public boolean isMultiply(char inputSeparator) {
        return inputSeparator == MULTIPLY.separator;
    }
    public boolean isDivision(char inputSeparator) {
        return inputSeparator == DIVISION.separator;
    }
}
