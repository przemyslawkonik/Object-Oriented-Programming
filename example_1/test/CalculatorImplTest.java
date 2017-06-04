import main.model.device.Calculator;
import main.model.device.CalculatorImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public class CalculatorImplTest {

    private Calculator calculator;

    @Before
    public void prepare() {
        calculator = new CalculatorImpl();
    }

    @Test
    public void resetTest() {
        Assert.assertEquals(BigDecimal.ZERO, calculator.reset());
    }

    @Test
    public void setResultTest() {

        calculator.setResult(new BigDecimal(55.3));
        Assert.assertEquals(new BigDecimal(55.3), calculator.getResult());

        calculator.setResult(new BigDecimal(300000.00000));
        Assert.assertEquals(new BigDecimal(300000), calculator.getResult());

        calculator.setResult(new BigDecimal(343.00));
        Assert.assertEquals(new BigDecimal(343), calculator.getResult());

        calculator.setResult(new BigDecimal(0.000300));
        Assert.assertEquals(new BigDecimal(0.0003), calculator.getResult());
    }

}
