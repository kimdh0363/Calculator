package validator;
import static exception.ErrorMessage.*;

public class InputValidator {


    private void NullValidator(String input) {
        if (input == null) {
            throw new IllegalArgumentException(IS_NULL.getErrorMessage());
        }
    }
    private void EmptyValidator(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException(IS_EMPTY.getErrorMessage());
        }
    }
}
