package calculator.domain;

public final class Tokenizer {

    //기본 구분자 패턴
    private static final String DEFAULT_PATTERN = "[,:]";

    public String[] split(final String input) {
        //커스텀 구분자 처리
        if (input.startsWith("//")) {
            //구분자 추출
            int newlineIndex = input.indexOf("\\n");
            //TODO: 입력형식 오류 시 예외처리

            String customDelimiter = input.substring(2, newlineIndex);
            String numbers = input.substring(newlineIndex + 2);

            return numbers.split(customDelimiter);
        }

        //기본 구분자 처리
        return input.split(DEFAULT_PATTERN);
    }
}