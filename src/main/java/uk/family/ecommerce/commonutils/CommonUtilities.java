package uk.family.ecommerce.commonutils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class CommonUtilities {

    public String getReversedString(String input) {
        StringBuffer sb = new StringBuffer(input);
        return sb.reverse().toString();
    }

    public int getStringLength(String input) {
        return input.length();
    }

    public int getHour() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.HOUR);
    }

    public int getMinute() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.MINUTE);
    }

    public int getSecond() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.SECOND);
    }

    public String getWeekDay() {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek day = currentDate.getDayOfWeek();
        return day.name();
    }

    public int getNoOfVowels(String input) {
        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            // check if char[i] is vowel
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                count++;
            }
        }
        return count;
    }


    public int getNoOfConsonents(String input) {
        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            // check if char[i] is vowel
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
            } else {
                count++;
            }
        }
        return count;
    }

    public int getHowManyDaysOldIam(String inputDateStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate inputDate = LocalDate.parse(inputDateStr, formatter);
            LocalDate today = LocalDate.now();

            long daysOld = ChronoUnit.DAYS.between(inputDate, today);

            if (daysOld < 0) {
                throw new RuntimeException("The input date is in the future.");
            } else {
                System.out.println("The date " + inputDateStr + " is " + daysOld + " days old.");
                return (int) daysOld;
            }

        } catch (Exception e) {
            throw new RuntimeException("Invalid date format. Please use yyyy-MM-dd.");
        }
    }

    public String getCharAt(String input, int position) {
        return String.valueOf(input.charAt(position));
    }

    public String getAppendedString(String input1, String  input2, String  input3, String  input4, String  input5,
                                    String seperatedBy) {
        return input1 + seperatedBy + input2 + seperatedBy + input3 + seperatedBy + input4 + seperatedBy + input5;
    }

    public int getStringLengthxx(String input, int i, int j, String pp) {
        return 5;
    }

}
