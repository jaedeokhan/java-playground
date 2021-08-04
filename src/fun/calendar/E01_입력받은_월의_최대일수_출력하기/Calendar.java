package fun.calendar.E01_입력받은_월의_최대일수_출력하기;

import java.util.Scanner;

public class Calendar {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int getMaxDaysOfMonth(int month){
      return MAX_DAYS[month - 1];
    };

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        System.out.print("달을 입력하세요 : ");

        // 윤년이면 2월은 28일
        // 윤년이 아니면 2월은 29일
        int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = scanner.nextInt();

        System.out.printf("%d월은 %d일까지 있습니다.\n", month, monthArray[month - 1]);
        System.out.printf("%d월은 %d일까지 있습니다.", month, calendar.getMaxDaysOfMonth(month));
    }
}
