
package com.example.method.references;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    // CONSTRUCTOR
    final Car car = Car.create(Car::new);
    final List<Car> cars = Arrays.asList(car);

    // STATIC METHOD
    cars.forEach(Car::collide);

    // METHOD
    cars.forEach(Car::repair);

    // INSTANCE METHOD
    final Car police = Car.create(Car::new);
    cars.forEach(police::follow);
  }
}