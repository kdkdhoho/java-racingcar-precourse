package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private Cars cars;

    public Service(String[] names) {
        this.cars = new Cars(createCars(names));
    }

    private List<Car> createCars(String[] names) {
        return Arrays.stream(names)
                .map(name -> name.trim())
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
