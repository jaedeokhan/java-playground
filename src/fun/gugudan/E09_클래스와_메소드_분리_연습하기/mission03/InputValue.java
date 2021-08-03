package fun.gugudan.E09_클래스와_메소드_분리_연습하기.mission03;

public class InputValue {


    private int row;
    private int column;

    InputValue(int row, int column){
        this.row = row;
        this.column = column;
    }

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

//    public static int[] save(String input) {
//        int[] inputValues = new int[2];
//        String[] splitedValue = input.split(",");
//
//        inputValues[0] = Integer.parseInt(splitedValue[0]);
//        inputValues[1] = Integer.parseInt(splitedValue[1]);
//
//        return inputValues;
//    }

//    public static InputValue save(String input) {
//        String[] splitedValue = input.split(",");
//
//        return new InputValue(Integer.parseInt(splitedValue[0]),
//                Integer.parseInt(splitedValue[1]));
//    }
}
