package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission02;

public class GugudanOutput {
    public static void print(int[][] result) {

        for (int i = 0; i < result.length; i++){
            System.out.println((i + 2) + "단 시작!!");
            for (int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
