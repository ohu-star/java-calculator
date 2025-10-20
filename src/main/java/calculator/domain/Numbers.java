package calculator.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Numbers {

    private final String[] tokens;

    public Numbers(final String[] tokens) {
        this.tokens = tokens;
    }

    //문자열에 포함된 숫자 합산
    public int sum() {
        int total = 0;
        for (final String token : tokens) {
            total += Integer.parseInt(token);
        }
        return total;
    }
}