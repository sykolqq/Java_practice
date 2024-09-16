package org.example;

public class Calculator implements CalculatorInterface<Integer> {
    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Double div(Integer a, Integer b) {
        // Не покрывается, так как Double не выбрасывает исключение
//        try {
//            return a * 1.0 / b;
//        } catch (ArithmeticException divineZero) {
//            System.out.println("Division by zero!");
//            divineZero.printStackTrace();
//        }
//        return Double.POSITIVE_INFINITY;
        if (b == 0) {
            System.out.println("Division by zero!");
        }
        return a * 1.0 / b;
    }

    @Override
    public Integer multi(Integer a, Integer b) {
        return a * b;
    }
}
