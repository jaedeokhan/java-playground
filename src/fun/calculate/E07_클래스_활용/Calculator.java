package fun.calculate.E07_클래스_활용;

public class Calculator {
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

}
