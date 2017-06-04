package main.model.tools;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public class Adjust {

    public static BigDecimal value(BigDecimal value) {
        if(isFractionalZero(value))
            return value = new BigDecimal(toBigInt(value));
        else
            return value = value.stripTrailingZeros();
    }

    private static boolean isFractionalZero(BigDecimal value) { return (value.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0); }

    private static BigInteger toBigInt(BigDecimal value) { return new BigInteger(value.setScale(0, BigDecimal.ROUND_HALF_UP).toString()); }
}
