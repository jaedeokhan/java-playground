package fun.calculate.E08_문자열_사칙연산_계산기.mycode;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args){

        // 요구사항
        // 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
        // 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다.
        // 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
        // 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

        // 사용자의 계산 수식을 입력 받는 클래스 - CalculatorInput
        Scanner scanner = new Scanner(System.in);
        String input = CalculatorInput.input(scanner); // 계산 수식 입력
        String[] splitedValues = CalculatorInput.splitInput(input); // 입력 받은 값 split

        // 값을 계산해주는 클래스와 메소드 - Calculator
        int result = Integer.parseInt(splitedValues[0]);

        for (int i = 1; i < splitedValues.length - 1; i += 2){
            String symbol = splitedValues[i];
            int second = Integer.parseInt(splitedValues[i + 1]);
            result = Calculator.calculate(result, symbol, second);
        }

        // result를 출력해주는 클래스와 메소드 - CalculatorOutput
        CalculatorOutput.print(result);
    }
}
