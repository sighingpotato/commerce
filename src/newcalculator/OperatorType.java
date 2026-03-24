package newcalculator;

public enum OperatorType {
    ADD('+'), SUB('-'), MUL('*'), DIV('/');

    private char math;

    OperatorType(char math) {
        this.math = math;
    }

    public static OperatorType fromChar(char operator) {    // static 변수를 선언해줘야 함
        if (operator == '+') {
            return ADD;
        } else if (operator == '-') {
            return SUB;
        } else if (operator == '*') {
            return MUL;
        } else if (operator == '/') {
            return DIV;
        } else {
            throw new IllegalArgumentException("잘못된 기호입니다!");
        }
    }
}