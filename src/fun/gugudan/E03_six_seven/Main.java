package fun.gugudan.E03_six_seven;

public class Main {

    public static void main(String[] args) {

        // 6단, 7단
        // 반복문으로 해결
        // for 문
        for (int i = 6; i < 8; i++){
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        // while 문
        int i = 6;
        while (i < 8){
            int j = 1;
            System.out.println(i + "단");
            while (j < 10){
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
