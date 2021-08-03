package fun.calculate.E04_조건문;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // 요구사항
        // 사용자에게 2개의 숫자 값과 사칙연산 기호(+, -, *, /) 중 하나를 입력 받는다.
        // 사용자가 입력한 사칙연산 기호에 따라 사칙연산을 계산한 후 결과를 출력한다.
        // 예를 들어 사용자는 값 2와 4 입력하고 곱셈(*) 기호를 입력하면 2 * 4의 결과인 8을 출력해야 한다.

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자 값 입력 : ");
        int x = scanner.nextInt();

        System.out.print("사칙연산 기호(+, -, *, /) 입력 : ");
        String symbol = scanner.next();

        System.out.print("두 번째 숫자 값 입력 : ");
        int y = scanner.nextInt();

        // symbol.equals("+")를 하지 않는 이유는 symbol이 NULL이면 NullPointException 에러가 발생 O
        // "+".equals(symbol)이면 symbol이 NULL이더라도 NullPointException 에러가 발생 X
        if ("+".equals(symbol)){
            System.out.println(x + y);
        } else if ("-".equals(symbol)){
            System.out.println(x - y);
        } else if ("*".equals(symbol)){
            System.out.println(x * y);
        } else if ("/".equals(symbol)){
            System.out.println(x / y);
        } else {
            System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
        }
    }

    // 추가 학습할 내용
    // 자바에서 값을 비교할 때 ==과 equals() 두 가지 방법을 사용한다.
    // 이 두 가지 방법의 차이점은 무엇이고, 어느 시점에 == 또는 equals()를 사용해야 하는가?
    // equals()는 객체의 값이 동일한지 비교할 때 사용한다.
    // ==는 객체의 주소가 동일한지 비교할 때 사용한다.
}
