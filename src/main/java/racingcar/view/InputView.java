package racingcar.view;

import racingcar.util.Validator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public String[] readNames() {
        System.out.println("이름을 입력하세요.");
        while (true) {
            try {
                String[] names = readLine().trim().split(",");
                Validator.validateNames(names);
                return names;
            } catch (IllegalArgumentException e) {
                System.out.println("이름을 다시 입력해주세요.");
            }
        }
    }

    public Long readTryCount() {
        System.out.println("시도 횟수는?");
        while (true) {
            try {
                String tryCount = readLine().trim();
                return Long.parseLong(tryCount);
            } catch (IllegalArgumentException e) {
                System.out.println("시도 횟수 다시 입력");
            }
        }
    }
}
