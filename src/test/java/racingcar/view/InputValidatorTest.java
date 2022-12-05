package racingcar.view;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.dto.NamesDto;
import racingcar.dto.TryCountDto;

import static org.assertj.core.api.Assertions.*;

class InputValidatorTest {
    private InputValidator inputValidator = new InputValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aaaaa", "", " ,"})
    void validateNames_예외발생(String input) {
        NamesDto namesDto = new NamesDto(input);

        assertThatIllegalArgumentException()
                .isThrownBy(() -> {
                    inputValidator.validateNames(namesDto);
                });
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa,aaa", "aa, aaa"})
    void validateNames_성공(String input) {
        NamesDto namesDto = new NamesDto(input);

        assertThatNoException()
                .isThrownBy(() -> {
                    inputValidator.validateNames(namesDto);
                });
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "", " ", "a "})
    void validateTryCount_예외발생(String input) {
        TryCountDto tryCountDto = new TryCountDto(input);

        assertThatIllegalArgumentException()
                .isThrownBy(() -> {
                    inputValidator.validateTryCount(tryCountDto);
                });
    }

    @Test
    void validateTryCount_성공() {
        String input = "3";
        TryCountDto tryCountDto = new TryCountDto(input);

        assertThatNoException()
                .isThrownBy(() -> {
                    inputValidator.validateTryCount(tryCountDto);
                });
    }
}