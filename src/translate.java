public class translate {
    private StringBuilder expression = new StringBuilder();

    public void calculate(String s) {
        expression.append(s);
    }

    public double ans() {
        int length = expression.length();
        if (length == 0) return 0;
        double currentNumber = 0, lastNumber = 0, result = 0;
        char operation = '+';
        for (int i = 0; i < length; i++) {
            char currentChar = expression.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
                if (operation == '+') {
                    lastNumber += currentNumber;
                } else if (operation == '-'){
                    lastNumber -= currentNumber;
                } else if (operation == '*') {
                    lastNumber = lastNumber * currentNumber;
                } else if (operation == '/') {
                    lastNumber = lastNumber / currentNumber;
                }
                operation = currentChar;
                currentNumber = 0;  // Reset currentNumber after an operation
            }
        }
        result += lastNumber;
        expression.setLength(0);  // Clear the expression
        return result;
    }
}