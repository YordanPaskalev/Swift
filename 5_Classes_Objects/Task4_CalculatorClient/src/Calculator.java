
import java.math.BigDecimal;

public class Calculator {

    double a;
    double b;
    BigDecimal result;

    public Calculator(double a, double b, BigDecimal result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    Calculator(String string, int i, int i0) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    BigDecimal sum(double a, double b) {
        BigDecimal one = BigDecimal.valueOf(a);
        BigDecimal two = BigDecimal.valueOf(b);
        result = one.add(two);
        return result;
    }

    BigDecimal multiply(double a, double b) {
        BigDecimal one = BigDecimal.valueOf(a);
        BigDecimal two = BigDecimal.valueOf(b);
        result = one.multiply(two);
        return result;
    }

    BigDecimal divide(double a, double b) {
        BigDecimal one = BigDecimal.valueOf(a);
        BigDecimal two = BigDecimal.valueOf(b);
        result = one.divide(two);
        return result;
    }

    BigDecimal subtract(double a, double b) {
        BigDecimal one = BigDecimal.valueOf(a);
        BigDecimal two = BigDecimal.valueOf(b);
        result = two.subtract(one);
        return result;
    }

    BigDecimal percentage(double a, double b) {
        BigDecimal one = BigDecimal.valueOf(a);
        BigDecimal two = BigDecimal.valueOf(b);
        BigDecimal three = BigDecimal.valueOf(100);
        three = one.divide(two);
        result = three.multiply(two);
        return result;
    }
}
