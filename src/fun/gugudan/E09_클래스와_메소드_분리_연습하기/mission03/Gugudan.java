package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission03;

public class Gugudan {

    public static int[][] calculate(int row, int column) {

        int[][] result = new int[row - 1][column];

        for (int i = 2; i <= row; i++){
            for (int j = 0; j < column; j++){
                result[i - 2][j] = i * (j + 1);
            }
        }

        return result;
    }
}
