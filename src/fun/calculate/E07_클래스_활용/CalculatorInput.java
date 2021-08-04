package fun.calculate.E07_클래스_활용;

import java.util.Scanner;

public class CalculatorInput {

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
}
