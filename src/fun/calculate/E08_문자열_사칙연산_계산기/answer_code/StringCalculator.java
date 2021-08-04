package fun.calculate.E08_문자열_사칙연산_계산기.answer_code;

import java.util.Scanner;

public class StringCalculator {

    static int calculate(int first, String symbol, int second) {

        int result = 0;

        if ("+".equals(symbol)){
            result = first + second;
            System.out.println("덧셈 : " + first + " " +  symbol + " " + second + " = " + result);
        } else if ("-".equals(symbol)){
            result = first - second;
            System.out.println("뺄셈 : " + first + " " +  symbol + " " + second + " = " + result);
        } else if ("*".equals(symbol)){
            result = first * second;
            System.out.println("곱셈 : " + first + " " +  symbol + " " + second + " = " + result);
        } else if ("/".equals(symbol)){
            result = first / second;
            System.out.println("나눗셈 : " + first + " " +  symbol + " " + second + " = " + result);
        } else {
            System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
        }

        return result;
    }

    static void print(int result){
        System.out.println("총 합 : " + result);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("계산할 값 입력 : ");

        String value = scanner.nextLine();
        System.out.println("입력값 : " + value);

        String[] splitedValues = value.split(" ");
        int first = Integer.parseInt(splitedValues[0]);
        int result = first;
        int i = 1;

        while (i < splitedValues.length){
            String symbol = splitedValues[i++]; // +,-,*,/ 입력
            int second = Integer.parseInt(splitedValues[i++]); // 두 번재 값 입력
            result = calculate(result, symbol, second); // 계산기 연산
        }

        print(result); // 총 합 출력
    }
}
