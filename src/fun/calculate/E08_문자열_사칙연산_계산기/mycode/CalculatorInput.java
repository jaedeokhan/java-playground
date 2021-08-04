package fun.calculate.E08_문자열_사칙연산_계산기.mycode;

import java.util.Scanner;

public class CalculatorInput {

    // 사용자가 입력한 계산 수식을 입력하는 메소드
    public static String input(Scanner scanner){

        String input = scanner.nextLine();

        return input;
    }

    public static String[] splitInput(String input){

        String[] splitedValues = input.split(" ");

        return splitedValues;
    }
}
