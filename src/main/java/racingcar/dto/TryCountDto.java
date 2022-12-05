package racingcar.dto;

public class TryCountDto {
    private final String tryCount;

    public TryCountDto(String tryCount) {
        this.tryCount = tryCount;
    }

    public Long toLong() {
        return Long.parseLong(tryCount);
    }
}
