package main.model.device;

import main.model.communication.Program;
import main.model.communication.input.Input;
import main.model.communication.output.Message;
import main.model.communication.output.MessageImpl;
import main.model.operators.Operator;
import main.model.tools.Adjust;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public class CalculatorImpl implements Calculator {

    private final Message message;
    private BigDecimal result;

    public CalculatorImpl() {
        message = new MessageImpl();
        reset();
    }

    @Override
    public void start() {
        message.printManual();
        while (true) {
            message.printEnterOperation();
            Input.enter();
            if (Program.isEnd()) {
                Program.end();
            } else if(!Input.isEligibleForProcess()) {
                message.printErrorOperation();
            } else {
                try {
                    reset();
                    processOperation(Input.get());
                    message.printResult(this);
                } catch (ArithmeticException e) {
                    message.printErrorDivision();
                }
            }
        }
    }

    @Override
    public BigDecimal reset() {
        return result = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal getResult() {
        return result;
    }

    @Override
    public void setResult(BigDecimal value) {
        result = value;
    }

    private void processOperation(String input) {
        List<BigDecimal> values = pullValues(input);
        List<Operator> operators = pullOperators(input);
        result = values.get(0);

        for(int i=0; i<operators.size(); i++) {
            switch (operators.get(i)) {
                case ADD: {
                    result = result.add(values.get(i+1));
                    break;
                }
                case SUBTRACT: {
                    result = result.subtract(values.get(i+1));
                    break;
                }
                case MULTIPLY: {
                    result = result.multiply(values.get(i+1));
                    break;
                }
                case DIVIDE: {
                    result = result.divide(values.get(i+1));
                    break;
                }
            }
        }
        result = Adjust.value(result);
    }

    private List<BigDecimal> pullValues(String input) {
        List<BigDecimal> values = new ArrayList<>();
        int begin = 0;
        int end = 0;
        char[] value;

        for(int i=0; i<input.length(); i++) {
            if((input.charAt(i) < 48 || input.charAt(i) > 57) && input.charAt(i) != Operator.SEPARATOR.get()) {
                end = i;
                value = new char[end-begin];
                input.getChars(begin, end, value, 0);
                values.add(new BigDecimal(value));
                begin = i+1;
            }
        }
        //dodanie ostatniej liczby
        end = input.length();
        value = new char[end-begin];
        input.getChars(begin, end, value, 0);
        values.add(new BigDecimal(value));

        return values;
    }

    private List<Operator> pullOperators(String input) {
        List<Operator> operators = new ArrayList<>();
        Operator[] possibleOperators = Operator.values();

        for(int i=0; i<input.length(); i++) {
            for(Operator o : possibleOperators)
                if(o.get() == input.charAt(i) && !o.equals(Operator.SEPARATOR))
                    operators.add(o);
        }
        return operators;
    }
}
