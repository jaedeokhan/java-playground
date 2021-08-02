package fun.gugudan.E07_class_gugudan;

class Gugudan {

    public static int[] calculate(int n){

        int[] result = new int[9];

        for (int i = 0; i < 9; i++){
            result[i] = n * (i + 1);
        }

        return result;
    }

    public static void print(int[] result, int n){

        System.out.println(n + "단 시작!!");

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}

public class GugudanMain {
    public static void main(String[] args) {

        // 클래스를 활용해 구구단 다시 구현
        for (int i = 2; i < 10; i++){
            int[] result = Gugudan.calculate(i); // 구구단 계산
            Gugudan.print(result, i); // 구구단 출력
        }
    }
}
