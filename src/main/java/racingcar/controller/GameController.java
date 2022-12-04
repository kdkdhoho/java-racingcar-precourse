package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    private Cars cars;
    private Long tryCount;

    public GameController() {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void run() {
        readData();
        move();
        finish();
    }

    private void readData() {
        String[] names = inputView.readNames();
        this.cars = new Cars(names);

        this.tryCount = inputView.readTryCount();
    }

    private void move() {
        for (int i = 0; i < tryCount; i++) {
            cars.move();
            outputView.printCurrent(cars.toString());
        }
    }

    public void finish() {
        List<String> winners = cars.winners();
        outputView.printResult(winners);
    }
}
