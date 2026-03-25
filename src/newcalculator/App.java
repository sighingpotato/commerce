package newcalculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArithmeticCalculator<Double> calc = new ArithmeticCalculator();

        while(true) {
            // 실수 입력 가능
            System.out.println("첫 번째 숫자(실수 가능)를 입력하세요");
            double num1 = scanner.nextDouble();

            System.out.print("두 번째 숫자(실수 가능)를 입력하세요: ");
            double num2 = scanner.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char math = scanner.nextLine().charAt(0);

            // enum 타입 변환
            OperatorType operator;
            operator = OperatorType.fromChar(math);

            // 계산
            double result = calc.calculate(num1, num2, operator);
            System.out.println("결과: " + result);

//            // 람다 스트림 이용
//            System.out.println("저장된 연산 결과들 중 큰 값만 볼까요? (숫자 입력): ");
//            double value = scanner.nextDouble();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitStr = scanner.nextLine();
            if (exitStr.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
            System.out.println("=====================");
        }

    }
}
