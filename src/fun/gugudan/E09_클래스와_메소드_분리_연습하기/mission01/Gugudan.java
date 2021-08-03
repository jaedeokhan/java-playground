package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission01;

public class Gugudan {
    public static int[] calculate(int times) {

        int[] result = new int[9];

        for (int i = 0; i < result.length; i++){
            result[i] = times * (i + 1);
        }

        return result;
    }
}
