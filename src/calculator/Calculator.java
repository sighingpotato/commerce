package calculator;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> results = new ArrayList<>();

    public int calculate(int num1, int num2, char math) {
        int result = 0;

        switch (math) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return 0;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산 기호입니다");
                return 0;
        }
        results.add(result);
        return result;
    }

    // Getter 메서드
    public ArrayList<Integer> getResults() {
        return results;
    }
    // Setter 메서드
    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }

    // 첫 번째 데이터 삭제 메서드
    public void removeResult() {
        if (results.size() > 0) {
            results.remove(0);
        } else {
            System.out.println("삭제할 데이터가 없습니다.");
        }
    }
}