package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission03;

public class InputValue {

    public static int[] setInput(String input) {
        int[] inputValues = new int[2];
        String[] splitedValue = input.split(",");

        inputValues[0] = Integer.parseInt(splitedValue[0]);
        inputValues[1] = Integer.parseInt(splitedValue[1]);

        return inputValues;
    }
}
