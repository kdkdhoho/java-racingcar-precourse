package racingcar.model;

import racingcar.util.RandomNumberGenerator;

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

    public void move() {
        for (Car car : cars) {
            if (RandomNumberGenerator.generate() >= 4) {
                car.move();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Car car : cars) {
            result.append(car).append("\n");
        }
        return result.toString();
    }

    public List<String> winners() {
        int highScore = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .getAsInt();

        return cars.stream()
                .filter(car -> car.getPosition() >= highScore)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
