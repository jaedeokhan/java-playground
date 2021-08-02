package fun.gugudan.E01_two_three;

public class Main {

    public static void main(String[] args) {
        // 2단, 3단
        for (int i = 2; i <= 3; i++){
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}
