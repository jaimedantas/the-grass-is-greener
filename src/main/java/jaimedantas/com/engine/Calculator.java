package jaimedantas.com.engine;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    private Calculator() {
        throw new IllegalStateException("Static class");
    }

    public static BigDecimal divide(long arg1, long arg2){
        BigDecimal arg1Norm = new BigDecimal(arg1);
        BigDecimal arg2Norm = new BigDecimal(arg2);
        return arg1Norm.divide(arg2Norm,3, RoundingMode.FLOOR).setScale(3, RoundingMode.FLOOR);
    }


}
