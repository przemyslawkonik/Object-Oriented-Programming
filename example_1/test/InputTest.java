import main.model.communication.input.Input;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public class InputTest {

    @Test
    public void setTest() {
        Input.set("test");
        Assert.assertEquals("test", Input.get());
    }

    @Test
    public void isEligibleForProcessTest() {
        Input.set("3.0-2.1");
        Assert.assertEquals(true, Input.isEligibleForProcess());

        Input.set("-3+2");
        Assert.assertEquals(false, Input.isEligibleForProcess());

        Input.set("323-251+");
        Assert.assertEquals(false, Input.isEligibleForProcess());

        Input.set("123385.434122/12323.123");
        Assert.assertEquals(true, Input.isEligibleForProcess());

        Input.set("32313.12313.3425424*213");
        Assert.assertEquals(false, Input.isEligibleForProcess());
    }

}
