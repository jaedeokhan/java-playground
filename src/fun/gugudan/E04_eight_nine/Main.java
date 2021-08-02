package fun.gugudan.E04_eight_nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // 8,9단 구현 - 값 입력 및 조건문
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int dan = Integer.parseInt(br.readLine());

        // 사용자의 입력값 예외처리
        if (!(dan >= 2 && dan <= 9)){
            System.out.println("2이상, 9이하 값만 입력 가능");
            System.exit(0);
        }

        // 사용자의 입력이 2~9인 경우는 정상적으로 출력
        System.out.println(dan + "단 시작!!");
        for (int i = 1; i <= 9; i++){
            System.out.println(dan * i);
        }

    }
}
