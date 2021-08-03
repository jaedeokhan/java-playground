package fun.calculate.E05_반복문;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // 요구사항
        // 한 번에 2개의 숫자 값만 사칙연산을 하는 것이 아니라 여러 개의 사칙연산이 가능해야 한다.
        // 앞 단계에서 계산한 결과 값은 이후 연산의 첫번째 값으로 사용해야 한다.
        // 예를 들어 4 + 2 * 3의 순서로 값을 입력하면 먼저 4 + 2가 계산되고
        // 결과 값 6과 3의 곱셈을 통해 18의 계산 결과가 나와야 한다.
        // 사칙연산 기호 대신 "quit"이라는 문자열을 입력하면 최종 계산 결과를 출력하고 프로그램을 종료한다.

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 값 : ");
        int first = scanner.nextInt();
        int result = first;

        while (true){
            System.out.print("(+, -, *, /) : ");
            String symbol = scanner.next();

            if ("quit".equals(symbol)) {
                // 최종 실행한 결과값을 출력
                System.out.println("최종값 : " + result);
                break;
            }

            System.out.print("다음 값 입력 : ");
            int second = scanner.nextInt();

            // 사칙연산 실행
            if ("+".equals(symbol)){
                result += second;
            } else if ("-".equals(symbol)){
                result -= second;
            } else if ("*".equals(symbol)){
                result *= second;
            } else if ("/".equals(symbol)){
                result /= second;
            } else {
                System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
            }

            System.out.println(result);
        }
    }
}
