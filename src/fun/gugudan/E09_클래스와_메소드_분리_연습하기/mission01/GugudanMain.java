package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission01;

public class GugudanMain {

    // 사용자가 숫자 값 하나를 입력하면 입력한 숫자의 구구단 결과를 출력한다

    // 사용자의 입력을 받는 클래스 - GugudanInput
    // 사용자 입력 값에 따른 구구단을 실행하는 클래스 - Gugudan
    // 구구단 실행 결과를 출력하는 클래스 - GugudanOutput
    // 이 3개의 클래스를 조합해 프로그램을 실행하는 클래스 - GuguandanMain
    public static void main(String[] args) {

        int times = GugudanInput.input();
        int[] result = Gugudan.calculate(times);
        GugudanOutput.print(result);

    }
}
