package main.model.device;

import java.math.BigDecimal;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public interface Calculator {
    void start();
    BigDecimal reset();
    BigDecimal getResult();
    void setResult(BigDecimal value);
}
