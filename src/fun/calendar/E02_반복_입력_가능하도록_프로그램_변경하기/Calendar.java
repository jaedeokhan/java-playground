package fun.calendar.E02_반복_입력_가능하도록_프로그램_변경하기;

import java.util.Scanner;

public class Calendar {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int getMaxDayOfMonth(int month){
        return MAX_DAYS[month - 1];
    }

    public static void main(String[] args){

        // 요구사항
        // 월을 입력하면 그 달이 몇일로 구성되어 있는지 출력하는 프로그램 작성하기
        // 원하는 입력횟수를 먼저 입력받는다.
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        System.out.print("반복횟수를 입력하세요 : ");
        int count = scanner.nextInt();

        System.out.println("월을 입력하세요 : ");
        for(int i = 0; i < count; i++){
            int month = scanner.nextInt();

            if (month == - 1) {
                System.out.println("Have a nice day!!");
                break;
            }

            if (month > 12) continue; // 달이 12보다 크면 다음 i 진행

            System.out.printf("%d월은 %d일까지 있습니다.\n", month, calendar.getMaxDayOfMonth(month));
        }
    }
}
