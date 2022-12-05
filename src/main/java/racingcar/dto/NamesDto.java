package racingcar.dto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesDto {
    private final String names;

    public NamesDto(String names) {
        this.names = names;
    }

    public List<String> toList() {
        return Arrays.stream(names.split(","))
                .map(name -> name.trim())
                .collect(Collectors.toList());
    }
}
