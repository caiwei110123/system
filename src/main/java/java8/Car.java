package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/9  上午10:30
 * @Version 1.0
 */
public class Car {
    public static Car create( final Supplier< Car > supplier ) {
        return supplier.get();
    }

    public static void collide( final Car car ) {
        System.out.println( "Collided " + car.toString() );
    }

    public void follow( final Car another ) {
        System.out.println( "Following the " + another.toString() );
    }

    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car = Car.create( Car::new );
        cars.add(car);
        cars.add(car);
        //Car car1 = Car.create(() -> new Car());
        cars.forEach( Car::collide );

        cars.forEach( Car::repair );
    }
}