package calculator;

import calculator.adapter.ConsoleController;
import calculator.application.CalculatorService;
import calculator.domain.Tokenizer;

public class Application {
    public static void main(final String[] args) {
        final Tokenizer tokenizer = new Tokenizer();
        final CalculatorService service = new CalculatorService(tokenizer);
        final ConsoleController controller = new ConsoleController(service);

        controller.run();
    }
}
