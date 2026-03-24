package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 1. 정수 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            // 2. 기호 입력 받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char math = scanner.nextLine().charAt(0); // 가장 처음에 있는 문자만 빼는 것

            // 결과 받아오기
            int result = calc.calculate(num1, num2, math);
            System.out.println("결과: " + result);

            // getter로 결과 확인
            System.out.println("현재 저장된 결과들: " + calc.getResults());

            // 첫 번째 데이터 삭제 기능
            System.out.println("첫 번째 결과를 삭제하시겠습니까? (yes 입력 시 삭제): ");
            String deleteStr = scanner.nextLine();
            if (deleteStr.equals("yes")) {
                calc.removeResult();
            }

            // exit를 입력하면 탈출
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
