package January24;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = string -> string.length() >4;//Checkable
        System.out.println(stringPredicate.test("hello"));

        BiFunction<Integer,Integer, String> biFunction = (a,b) -> a+""+b;//Concatable
        System.out.println(biFunction.apply(2,4));

        Consumer<String> consumer = System.out::println;//Printable
        consumer.accept("meow");

        Supplier<String> stringSupplier = () -> "Hello!";//Producable
        System.out.println(stringSupplier.get());

        UnaryOperator<String> unaryOperator = String::toUpperCase;//Transformable
        System.out.println(unaryOperator.apply("meow"));



    }
}
/*
Переписать лямбда выражения из класса Main пакета our_interfaces (см.код)
с использованием стандартных функциональных интерфейсов
 */