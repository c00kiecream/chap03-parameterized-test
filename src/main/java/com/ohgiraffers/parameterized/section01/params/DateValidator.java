package com.ohgiraffers.parameterized.section01.params;

import java.time.Month;

public class DateValidator {

    //받아온 매개변수 Month가 1월~12월 사이인지 확인을하고, 맞다면 true반환하고 틀리면 false 반환
    public static boolean isCollect(Month month) {

        int monthValue = month.getValue();

        return monthValue >= 1 && monthValue <= 12;

    }

    //
    public static int getLastDayOf(Month month) {

        return month.maxLength();
    }
}
