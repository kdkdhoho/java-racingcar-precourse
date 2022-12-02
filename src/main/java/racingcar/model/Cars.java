package racingcar.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] names) {
        this.cars = generateCars(names);
    }

    private List<Car> generateCars(String[] names) {
        return Arrays.stream(names)
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
