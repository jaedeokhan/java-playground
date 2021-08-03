package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission02;

import java.util.Scanner;

public class GugudanInput {
    public static int input(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("실행 할 구구단을 입력 : ");

        return scanner.nextInt();
    }
}
