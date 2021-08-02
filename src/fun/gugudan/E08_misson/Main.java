package fun.gugudan.E08_misson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Gugudan_final_1 {

    // calculate
    public static int[] calculate(int times, int inputValue){

        int[] result = new int[inputValue];
        for (int i = 0; i < inputValue; i++){
            result[i] = times * (i + 1);
        }

        return result;
    }

    // print
    public static void print(int[] result){

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) throws IOException {

        // 추가 미션 및 마무리하기
        // 최종 요구사항 1
        // 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
        // 8을 입력하면 8 * 8, 19 * 19

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputValue = Integer.parseInt(br.readLine());

        for (int i = 2; i <= inputValue; i++){
            int[] result = Gugudan_final_1.calculate(i, inputValue);
            Gugudan_final_1.print(result);
        }

    }
}
