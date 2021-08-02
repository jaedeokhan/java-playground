package fun.gugudan.E05_array_gugudan;

public class Main {
    public static void main(String[] args) {
        // 배열로 구구단 다시 구현
        int[] result = new int[9];

        for (int i = 2; i <= 9; i++){
            System.out.println(i + "단 시작!!");

            for (int j = 0; j < result.length; j++){
                result[j] = i * (j + 1);
            }

            for (int j = 0; j < result.length; j++){
                System.out.print(result[j] + " ");
            }

            System.out.println();
        }

    }
}
