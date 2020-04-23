package java8;

import java.util.Objects;
import java.util.function.*;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/8  下午10:30
 * @Version 1.0
 */
public class main {

    public static void main(String[] args) {
        Function<String,String> function  = (x) -> {
          return x+"function";
        };
        System.out.println(function.apply("Hello  world"));

        UnaryOperator<String> unaryOperator = x -> {
            x = x+2;
            x  = x+4;
            return x;
        };
        System.out.println(unaryOperator.apply("001-"));

        Predicate<Integer> predicate = (x) -> {
            return x % 2 == 0;
        };
        System.out.println(predicate.test(1));

        Consumer<String> consumer = (x) -> {

            System.out.println(x);
        };
        consumer.accept("1");

        Supplier<Person1> supplier =  Person1::new;
        Person1 person1 = supplier.get();
        System.out.println(person1==null?"1":"2");

        Supplier<String> stringSupplier = () -> {
            return "123";
        };
        System.out.println(stringSupplier.get());

        BinaryOperator<Integer> integerBinaryOperator = (x,y) -> {
            return x>y?x:y;
        };
        System.out.println(integerBinaryOperator.apply(1,2));
        ////PersonFactory
        // <Person1> personFactory =
        //Runnable runnable = Person1::new;
        ////Person1 person = personFactory.create("Peter", "Parker");
        //System.out.println(runnable.toString());

        //int num = 1;
        //Converter<Integer, String> stringConverter =
        //    (from) -> String.valueOf(from + num);
        //
        //stringConverter.convert(2);     // 3



        //Predicate<String> predicate = (s) -> s.length() > 0;
        //
        //Boolean result = null;
        //result = predicate.test("foo");              // true
        //System.out.println(result);
        //predicate.negate().test("foo");     // false
        //
        //Predicate<Boolean> nonNull = Objects::nonNull;
        //result = nonNull.test(true);
        //System.out.println(result);
        //
        //Predicate<Boolean> isNull = Objects::isNull;
        //result = nonNull.test(true);
        //System.out.println(result);
        //
        //
        //Predicate<String> isEmpty = String::isEmpty;
        //result = isEmpty.test("123");
        //System.out.println(result);


        //Predicate<String> isNotEmpty = isEmpty.negate();


        //
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        //Function<Person, Person1> toInteger1 = Person1::a;
        //
        //Person1 person1 =  toInteger1.apply(new Person());
        //System.out.println(person1.toString());
        ////
        String a =  backToString.apply("123");     // "123"
        ////System.out.println(a);
        //
        //
        //Supplier<Person> personSupplier = Person::new;
        ////personSupplier.get().getId();   // new Person
        //Consumer<Person1> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        //greeter.accept(new Person1("Luke", "Skywalker"));
    }
}
