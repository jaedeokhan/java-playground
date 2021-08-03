package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission01;

public class GugudanOutput {
    public static void print(int[] result) {

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
