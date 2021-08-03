package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission01;

import java.util.Scanner;

public class GugudanInput {

    public static int input(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("사용할 구구단 단을 입력 : ");

        return scanner.nextInt();
    }
}
