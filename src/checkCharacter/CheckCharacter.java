package checkCharacter;

public enum CheckCharacter {
    COMMA(','),
    COLON(':'),
    SPACE(' '),
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVISION('/');

    private final char separator;

    CheckCharacter(char separator) {
        this.separator = separator;
    }

    public boolean isSeparator(char inputSeparator) {
        return inputSeparator == COMMA.separator || inputSeparator == COLON.separator;
    }
    public boolean isSpace(char inputSeparator) {
        return inputSeparator == SPACE.separator;
    }
    public boolean isPlus(char inputSeparator) {
        return inputSeparator == PLUS.separator;
    }
    public boolean isMinus(char inputSeparator) {
        return inputSeparator == MINUS.separator;
    }
    public boolean isMultiply(char inputSeparator) {
        return inputSeparator == MULTIPLY.separator;
    }
    public boolean isDivision(char inputSeparator) {
        return inputSeparator == DIVISION.separator;
    }
}
