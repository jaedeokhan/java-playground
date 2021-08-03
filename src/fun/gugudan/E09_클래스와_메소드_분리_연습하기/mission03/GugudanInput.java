package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission03;

import java.util.Scanner;

public class GugudanInput {
    public static int[] input(){

        Scanner scanner = new Scanner(System.in);
        int[] inputValues = new int[2];

        System.out.print("구구단 몇 단(8,7) : ");
        String inputValue = scanner.nextLine();
        String[] splitedValues = inputValue.split(",");

        inputValues[0] = Integer.parseInt(splitedValues[0]);
        inputValues[1] = Integer.parseInt(splitedValues[1]);

        return inputValues;
    }
}
