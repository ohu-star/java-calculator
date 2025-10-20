package calculator.domain;

public final class Tokenizer {

    //기본 구분자 패턴
    private static final String PATTERN = "[,:]"; // 쉼표 또는 콜론

    public String[] split(final String input) {
        return input.split(PATTERN);
    }
}