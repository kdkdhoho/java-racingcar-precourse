package racingcar.view;

import java.util.List;
import java.util.StringJoiner;

public class OutputView {

    public void printCurrent(String current) {
        System.out.println(current);
    }

    public void printResult(List<String> winners) {
        StringJoiner result = new StringJoiner(", ", "최종 우승자 : ", "");
        for (String name : winners) {
            result.add(name);
        }
        System.out.println(result.toString());
    }
}
