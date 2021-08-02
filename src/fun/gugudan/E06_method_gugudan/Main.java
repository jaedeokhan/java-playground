package fun.gugudan.E06_method_gugudan;

public class Main {

    public static int[] calculate(int[] result, int n){

        for (int i = 0; i < 9; i++){
            result[i] = n * (i + 1);
        }

        return result;
    }

    public static void print(int[] result, int n){

        System.out.println(n + "단 시작!!");

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 메소드 활용해 구구단 다시 구현
        // 반복적으로 발생하는 부분을 메소드로 활용해 반복되는 부분을 줄인다.
        int[] result = new int[9];

        for (int i = 2; i <= 9; i++){

            // result[i ~ 9]까지 i 곱하기 값을 기록해줄 함수
            result = calculate(result, i);

            // result[i] ~ result[9]까지 출력을 해줄 함수
            print(result, i);

        }
    }


}
