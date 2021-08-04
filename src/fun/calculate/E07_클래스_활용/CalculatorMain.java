package fun.calculate.E07_클래스_활용;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args){

        // 프로그램의 코드가 복잡해지고 코드의 양이 많이지면
        // 클래스를 나눠서 만들어주는게 유지보수성이나 관리가 하기 좋다.

        Scanner scanner = new Scanner(System.in);

        int first = CalculatorInput.getFirstInputValue(scanner); // 첫 번재 값 입력
        int result = first;

        while (true){
            String symbol = CalculatorInput.getSymbolInputValue(scanner); // +,-,*,/ 입력

            if ("quit".equals(symbol)) { // "quit"이면 result 출력 후 종료
                CalculatorOutput.print(result);
                break;
            }

            int second = CalculatorInput.getSecondInputValue(scanner); // 두 번재 값 입력

            result = Calculator.calculate(result, symbol, second); // 계산기 연산
            CalculatorOutput.print(result); // 총 합 출력
        }

    }
}
