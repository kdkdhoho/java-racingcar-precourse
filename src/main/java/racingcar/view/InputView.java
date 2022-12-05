package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.dto.TryCountDto;
import racingcar.dto.NamesDto;

public class InputView {
    private final InputValidator inputValidator = new InputValidator();

    public NamesDto readNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String names = Console.readLine();
        NamesDto namesDto = new NamesDto(names);
        try {
            inputValidator.validateNames(namesDto);
            return namesDto;
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR]");
            return readNames();
        }
    }

    public TryCountDto readTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        TryCountDto tryCountDto = new TryCountDto(input);
        try {
            inputValidator.validateTryCount(tryCountDto);
            return tryCountDto;
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR]");
            return readTryCount();
        }
    }
}
