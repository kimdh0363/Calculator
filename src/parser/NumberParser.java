package parser;

import java.util.ArrayList;
import java.util.List;

import characterValidator.CharacterValidator;

public class NumberParser {
    CharacterValidator characterValidator;

    public List<Integer> parserNumber(String input) {

        final int FRONT_SPACE_INDEX = input.length() - 2;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < FRONT_SPACE_INDEX; i++) {
            if (!characterValidator.isSeparator(input.charAt(i))) {
                numbers.add(Integer.parseInt(String.valueOf(input.charAt(i))));
            }
        }

        return numbers;
    }
}
