package calculator.domain;

public final class Tokenizer {

    //기본 구분자 패턴
    private static final String DEFAULT_PATTERN = "[,:]"; // 기본 구분자 (, :)

    public String[] split(final String input) {
        //커스텀 구분자 처리
        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf("\\n");

            if (newlineIndex == -1 || newlineIndex <= 2) {
                throw new IllegalArgumentException("잘못된 커스텀 구분자 형식입니다.");
            }

            String customDelimiter = input.substring(2, newlineIndex);
            if (customDelimiter.isEmpty()) {
                throw new IllegalArgumentException("커스텀 구분자가 비어 있습니다.");
            }

            String numbers = input.substring(newlineIndex + 2);
            if (numbers.isEmpty()) {
                throw new IllegalArgumentException("구분자 뒤에 숫자가 없습니다.");
            }

            return numbers.split(customDelimiter);
        }

        //기본 구분자 처리
        return input.split(DEFAULT_PATTERN);
    }
}