package racingcar.util;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumberGenerator {

    public static int generate() {
        return pickNumberInRange(1, 9);
    }
}
