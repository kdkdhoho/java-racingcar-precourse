package racingcar.service;

import org.junit.jupiter.api.Test;

class ServiceTest {

    private Service service;

    @Test
    void createCars_Success() {
        String[] names = {"a", "bb", "ccc"};

        service = new Service(names);

    }
}