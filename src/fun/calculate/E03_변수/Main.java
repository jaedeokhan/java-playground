package fun.calculate.E03_변수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 요구사항
        // 사용자로부터 2개의 숫자 값을 입력 받은 후 2개의 숫자 값을 활용해 사칙연산을 계산한다.
        // 계산한 결과 값을 화면에 출력한다.

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }
}
