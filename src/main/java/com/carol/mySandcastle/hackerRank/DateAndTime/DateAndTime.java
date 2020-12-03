package com.carol.mySandcastle.hackerRank.DateAndTime;

import java.time.LocalDate;

public class DateAndTime {

    public static String findDay(int month, int day, int year) {
        LocalDate dateTime = LocalDate.of(year, month, day);
        return dateTime.getDayOfWeek().toString();
    }
}
