import main.model.Operator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public class OperatorTest {

    @Test
    public void getTest() {
        Assert.assertEquals(Operator.ADD, Operator.valueOf("ADD"));
        Assert.assertEquals('-', Operator.SUBTRACT.get());
        Assert.assertEquals("/", Operator.DIVIDE.toString());
        Assert.assertEquals(Operator.MULTIPLY, Operator.MULTIPLY);
    }
}
