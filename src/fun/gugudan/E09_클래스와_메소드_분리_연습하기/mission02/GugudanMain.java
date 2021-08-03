package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission02;

public class GugudanMain {
    // 요구사항 2
    // 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
    // 예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.

    public static void main(String[] args) {

        int column = GugudanInput.input();
        int[][] result = Gugudan.calculate(column);
        GugudanOutput.print(result);

    }

}
