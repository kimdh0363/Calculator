package calculator;
import characterValidator.CharacterValidator;
import operator.Operator;
import parser.NumberParser;
import parser.OperatorParser;
import operator.Operator.*;
import java.util.List;

public class Calculator {
    OperatorParser operatorParser = new OperatorParser();
    NumberParser numberParser = new NumberParser();

    public double getResult(String input) {
        char operator = operatorParser.parserOperator(input);
        List<Integer> numbers = numberParser.parserNumber(input);
        double result = numbers.getFirst();
        for (int i = 1; i < numbers.size(); i++) {

        }
    }
}
