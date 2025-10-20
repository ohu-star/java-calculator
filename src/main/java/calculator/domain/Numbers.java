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
            try {
                int value = Integer.parseInt(token);

                //음수 처리
                if (value < 0) {
                    throw new IllegalArgumentException("음수는 허용되지 않습니다.");
                }

                total += value;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("잘못된 숫자 형식입니다.");
            }
        }
        return total;
    }
}