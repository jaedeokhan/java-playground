package fun.calendar.E03_가상의_달력_찍기;

import java.util.Scanner;

public class Calendar {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year){
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ?
                true : false;
    }

    public int getMaxDayOfMonth(int year, int month){
        return (isLeapYear(year)) ? // 윤년이면
                LEAP_MAX_DAYS[month - 1] :
                MAX_DAYS[month - 1];
    }


    public int getYearOrMonthInput(Scanner scanner){
        return scanner.nextInt();
    }


    public void printCalendar(int year, int month){

        System.out.printf("  <<%4d년 %3d월>>\n", year, month);
        System.out.println("SU MO TU WE TH FR SA");
        System.out.println("--------------------");

        int maxDayOfMonth = getMaxDayOfMonth(year, month);

        for (int i = 1; i <= maxDayOfMonth; i++){

            if (i < 10){
                System.out.print(" " + i + " ");
            } else {
                System.out.print(i + " ");
            }

            if (i % 7 == 0){ // 7의 배수이면 다음 행으로
                System.out.println();
            }
        }

        System.out.println();
    }
}
