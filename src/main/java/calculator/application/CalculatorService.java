package calculator.application;

import calculator.domain.Numbers;
import calculator.domain.Tokenizer;

public class CalculatorService {
    private final Tokenizer tokenizer;

    public CalculatorService(final Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    //입력된 문자열 파싱 후 숫자의 합 계산
    public int calculate(final String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        //문자열을 기본 구분자(, :) 기준으로 분리
        final String[] tokens = tokenizer.split(input);

        //분리된 문자열을 숫자로 변환하고 합산
        final Numbers numbers = new Numbers(tokens);
        return numbers.sum();
    }
}
