package fun.calendar.E03_가상의_달력_찍기;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT = "cal> ";

    public void runPrompt(){
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();

        int year = 2021;
        int month = 1;

        while (true) {

            System.out.println("년을 입력하세요.");
            System.out.print(PROMPT);
            year = calendar.getYearOrMonthInput(scanner);

            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            month = calendar.getYearOrMonthInput(scanner);

            if (month == -1) break;
            if (month > 12) continue;

            calendar.printCalendar(year, month);
        }

        System.out.println("Have a nice day!!");
    }

    public static void main(String[] args){

        // 요구사항
        // 월을 입력하면 해당월의 달력을 출력한다.
        // 달력은 모양은 1단계에서 작성한 모양으로 만든다.
        // 1일은 일요일로 정해도 무방하다.
        // -1을 입력받기 전까지 반복 입력받는다.
        // 프롬프트를 출력한다.
        Prompt prompt = new Prompt();
        prompt.runPrompt();

        // 요구사항
        // 윤년 추가
        // 윤년은 4로 나누어 떨어지는 해,
        // 100으로 나누어 떨어지는 해는 평년,
        // 400으로 나누어 떨어지는 해는 다시 윤년

    }
}
