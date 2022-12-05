package racingcar.view;

import racingcar.dto.NamesDto;
import racingcar.dto.TryCountDto;

import java.util.List;
import java.util.Optional;

public class InputValidator {

    public void validateNames(NamesDto namesDto) {
        List<String> names = namesDto.toList();
        Optional<String> result = names.stream()
                .filter(name -> name.length() >= 5 || name.isEmpty())
                .findAny();

        if (result.isPresent()) {
            throw new IllegalArgumentException();
        }
    }

    public void validateTryCount(TryCountDto tryCountDto) {
        try {
            Long tryCount = tryCountDto.toLong();
            validateRange(tryCount);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void validateRange(Long tryCount) {
        if (tryCount < 1) {
            throw new IllegalArgumentException();
        }
    }
}
