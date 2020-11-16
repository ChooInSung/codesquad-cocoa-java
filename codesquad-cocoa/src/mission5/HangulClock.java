package mission5;

import java.util.Date;

public class HangulClock {

    String[] hours = new String[10];
    String[] minutes = new String[10];

    public HangulClock() {
        this.hours[0] = "한";
        this.hours[1] = "두";
        this.hours[2] = "세";
        this.hours[3] = "네";
        this.hours[4] = "다섯";
        this.hours[5] = "여섯";
        this.hours[6] = "일곱";
        this.hours[7] = "여덟";
        this.hours[8] = "아홉";

        this.minutes[0] = "일";
        this.minutes[1] = "이";
        this.minutes[2] = "삼";
        this.minutes[3] = "사";
        this.minutes[4] = "오";
        this.minutes[5] = "육";
        this.minutes[6] = "칠";
        this.minutes[7] = "팔";
        this.minutes[8] = "구";
        this.minutes[9] = "십";
    }

    public static void main(String[] args) {
        HangulClock main = new HangulClock();
        main.showTime();
    }

    public void showTime() {
        Date date = new Date();
        this.getHour(date.getHours());
        this.getMinutes(date.getMinutes());
    }

    public void getHour(int hour) {

        if (hour == 23) {
            System.out.print("열한시 ");
            return;
        }

        if (hour == 22) {
            System.out.print("열시 ");
            return;
        }

        if (hour > 12) {
            System.out.print(this.hours[hour - 13] + "시 ");
            return;
        }

        if (hour == 10) {
            System.out.print("열시 ");
            return;
        }

        if (hour > 10) {
            System.out.print("열" + this.hours[hour % 10 - 1] + "시 ");
            return;
        }

        if (hour > 0) {
            System.out.print(this.hours[hour - 1] + "시 ");
            return;
        }

        if (hour == 0) {
            System.out.print("열두시 ");
        }

    }

    public void getMinutes(int minutes) {

        int firstDigitMinutes = minutes / 10;
        int secondDigitMinutes = minutes % 10;

        if (firstDigitMinutes == 0) {
            System.out.println(this.minutes[secondDigitMinutes - 1] + "분");
            return;
        }

        if (firstDigitMinutes == 1) {
            System.out.println("십" + this.minutes[secondDigitMinutes - 1] + "분");
            return;
        }

        if (firstDigitMinutes > 1) {
            System.out.println(this.minutes[firstDigitMinutes - 1] + "십" + this.minutes[secondDigitMinutes - 1] + "분");
        }
    }

}
