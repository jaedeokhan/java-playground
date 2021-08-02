package fun.gugudan.E08_misson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Gugudan_2 {

    public static int[] calculate(int times, int column){

        int[] result = new int[column];

        for (int i = 0; i < column; i++){
            result[i] = times * (i + 1);
        }

        return result;
    }

    public static void print(int[] result){

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}

public class Main_2 {
    public static void main(String[] args) throws IOException {

        // 추가 미션 및 마무리하기
        // 최종 요구사항 2
        // 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
        // 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
        // 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputTimes = br.readLine().split(",");
        int row = Integer.parseInt(inputTimes[0]);
        int column = Integer.parseInt(inputTimes[1]);

        for (int i = 1; i <= row; i++){
            int[] result = Gugudan_2.calculate(i, column);
            Gugudan_2.print(result);
        }

    }
}
