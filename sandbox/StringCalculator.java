public class StringCalculator {
    public int DEFAULT_RESULT = 0;

    public int add(String input) {
        if (input.equals("")) {
            return DEFAULT_RESULT;
        }
        if (input.contains(",")) {
            return handleMultiple(input);
        }
        return parseSingle(input);
    }

    private static int parseSingle(String input) {
        return Integer.parseInt(input);
    }

    private int handleMultiple(String input) {
        String[] numbers = input.split(',');
        return add(numbers[0]) + add(numbers[1]);
    }
}
