package newcalculator;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {
    private T number;

    private ArrayList<Double> results = new ArrayList<Double>();

    public double calculate(T num1, T num2, OperatorType math) {
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();
        double result = 0;

        switch (math) {
            case ADD:
                result = n1 + n2;
                break;
            case SUB:
                result = n1 - n2;
                break;
            case MUL:
                result = n1 * n2;
                break;
            case DIV:
                if (n2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                result = n1 / n2;
                break;
            default:
                System.out.println("잘못된 연산 기호입니다");
                return 0;
        }
        results.add(result);
        return result;
    }

    // Getter 메서드
    public ArrayList<Double> getResults() {
        return results;
    }

    // Setter 메서드
    public void setResults(ArrayList<Double> results) {
        this.results = results;
    }

    // 람다 스트림
//    public
//    stream()
//    filter()
//    forEach()

}

