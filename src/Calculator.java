import java.util.function.*;

public class Calculator {
    // стат перем для  экземпляра Calculator
    public static Supplier<Calculator> instance = Calculator::new;

    // бинарные операторы для мат операций
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> divide = (x, y) -> {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    };

    // унарные операторы для операций над одним числом
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> Math.abs(x);

    // для определения положительного числа
    public Predicate<Integer> isPositive = x -> x > 0;

    // для вывода числа в консоль
    public Consumer<Integer> println = System.out::println;
}