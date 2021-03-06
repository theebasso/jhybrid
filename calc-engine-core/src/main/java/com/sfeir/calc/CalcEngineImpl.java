package com.sfeir.calc;

public class CalcEngineImpl implements CalcEngine {

    @Override
    public int evaluate(String expression) {

        // Removing all blanks and non visible chars
        expression = expression.replaceAll("\\s+", "");

        if (expression.contains("+")) {
            String[] parts = expression.split("[+]");

            int left = toInt(parts[0]);
            int right = toInt(parts[1]);

            return left + right;
        }

        return toInt(expression);
    }

    private static int toInt(String part) {
        return Integer.parseInt(part);
    }
}
