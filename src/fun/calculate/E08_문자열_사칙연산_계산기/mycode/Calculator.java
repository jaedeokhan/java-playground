package fun.calculate.E08_문자열_사칙연산_계산기.mycode;

public class Calculator {
    public static int calculate(int first, String symbol, int second) {

        int result = 0;

        if ("+".equals(symbol)){
            result = first + second;
            System.out.println("덧셈 : " + result);
        } else if ("-".equals(symbol)){
            result = first - second;
            System.out.println("뺄셈 : " + result);
        } else if ("*".equals(symbol)){
            result = first * second;
            System.out.println("곱셈 : " + result);
        } else if ("/".equals(symbol)){
            result = first / second;
            System.out.println("나눗셈 : " + result);
        } else {
            System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
        }

        return result;
    }
}
