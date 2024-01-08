import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Supplier<Calculator> calc = Calculator::new;

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(4, 0);
            calc.println.accept(c);
    }
}





