package fun.calculate.E06_메소드_나누기;

import java.util.Scanner;

public class Calculator {

    static int getFirstInputValue(Scanner scanner){
        System.out.print("첫 번째 연산 값 : ");
        int first = scanner.nextInt();
        System.out.println(first);
        return first;
    }

    static String getSymbolInputValue(Scanner scanner){
        System.out.print("(+, -, *, /) : ");
        String symbol = scanner.next();
        System.out.println(symbol);
        return symbol;
    }

    static int getSecondInputValue(Scanner scanner){
        System.out.print("두 번째 연산 값 : ");
        int second = scanner.nextInt();
        System.out.println(second);
        return second;
    }

    static int calculate(int first, String symbol, int second) {
        int result = 0;

        if ("+".equals(symbol)){
            result = first + second;
        } else if ("-".equals(symbol)){
            result = first - second;
        } else if ("*".equals(symbol)){
            result = first * second;
        } else if ("/".equals(symbol)){
            result = first / second;
        } else {
            System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
        }

        return result;
    }

    static void print(int result){
        System.out.println("총 합 : " + result);
    }
    public static void main(String[] args){

        // 요구사항
        // 사용자의 값을 입력하는 구현(예로 input 메소드),
        // 입력 값에 따라 사칙연산 구현(예로 main 메소드),
        // 사칙연산 결과 값을 출력하는 구현(예로 output 메소드)을 서로 다른 메소드로 나누어 구현한다.
        // 사용자의 값을 입력하는 구현은 첫 번째 숫자 값,
        // 사칙연산 기호 및 quit, 두 번째 숫자 값 입력으로 나뉜다.
        Scanner scanner = new Scanner(System.in);

        int first = getFirstInputValue(scanner); // 첫 번재 값 입력
        int result = first;

        while (true){
            String symbol = getSymbolInputValue(scanner); // +,-,*,/ 입력

            if ("quit".equals(symbol)) { // "quit"이면 result 출력 후 종료
                print(result);
                break;
            }

            int second = getSecondInputValue(scanner); // 두 번재 값 입력

            result = calculate(result, symbol, second); // 계산기 연산
            print(result); // 총 합 출력
        }
    }
}
