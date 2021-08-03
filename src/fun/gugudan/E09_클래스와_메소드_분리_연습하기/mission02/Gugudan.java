package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission02;

public class Gugudan {
    public static int[][] calculate(int column){

        int[][] result = new int[column - 1][column];

        // 기존에 GugudanMain에서 2 ~ n단 까지 실행해주는 역할을 Gugudan.calculate()에서 처리
        for (int i = 2; i <= column; i++) {
            for (int j = 0; j < column; j++) {
                result[i - 2][j] = i * (j + 1);
            }
        }

        return result;
    }
}
