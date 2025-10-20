package calculator.adapter;

import calculator.application.CalculatorService;
import camp.nextstep.edu.missionutils.Console;

public final class ConsoleController {

    private final CalculatorService service;

    public ConsoleController(CalculatorService service) {
        this.service = service;
    }

    public void run() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        int result = service.calculate(input);
        System.out.println("결과 : " + result);
    }
}