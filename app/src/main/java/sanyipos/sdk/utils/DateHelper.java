package sanyipos.sdk.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class DateHelper {

    public final static SimpleDateFormat inputParser = new SimpleDateFormat("HH:mm");

    public final static SimpleDateFormat defaultFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public final static SimpleDateFormat noSecondFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

    public final static SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public final static SimpleDateFormat hmsFormater = new SimpleDateFormat("HH:mm:ss", Locale.US);

    public final static SimpleDateFormat hmFormater = new SimpleDateFormat("HH:mm", Locale.US);

    public final static SimpleDateFormat systemDateFormater = new SimpleDateFormat("yyyy年MM月dd日 HH:mm", Locale.US);

    public final static SimpleDateFormat mDateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
    public final static SimpleDateFormat hDateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH", Locale.US);

    public final static long dayTimeStamp = 1000 * 60 * 60 * 24; // 一天毫秒

    // public static boolean compareDates(String beginTime, String endTime) {
    // Date dateCompareOne;
    // Date dateCompareTwo;
    // Date date;
    // Calendar now = Calendar.getInstance();
    //
    // int hour = now.get(Calendar.HOUR_OF_DAY);
    // int minute = now.get(Calendar.MINUTE);
    //
    // date = parseDate(hour + ":" + minute);
    // dateCompareOne = parseDate(beginTime);
    // dateCompareTwo = parseDate(endTime);
    // Calendar begin = Calendar.getInstance();
    // begin.setTime(Da)
    //
    // // close date is in the date after midnight
    // if (dateCompareTwo.before(dateCompareOne)) {
    // dateCompareTwo = new Date(dateCompareTwo.getTime() + 12 * 60 * 60
    // * 1000);
    // }
    // if (date.after(dateCompareOne) && date.before(dateCompareTwo)) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    public static boolean inBetweenTime(String beginTime, String endTime) {
        Calendar now = Calendar.getInstance();

        Calendar begin = Calendar.getInstance();
        begin.setTime(parseDate(beginTime));
        begin.set(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH));
        Calendar end = Calendar.getInstance();
        end.setTime(parseDate(endTime));
        end.set(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH));
        if (end.before(begin)) {
            end.add(Calendar.DATE, 1);
        }
        return now.after(begin) && now.before(end);
    }

    public static boolean compareTimes(String time, String beginTime, String endTime) {
        return compareTimes(parseDate(time), beginTime, endTime);
    }

    public static boolean compareTimes(Date time, String berginTime, String endTime) {
        Calendar date = Calendar.getInstance();
        date.setTime(time);
        Calendar beginDate = Calendar.getInstance();
        beginDate.setTime(parseDate(berginTime));
        beginDate.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(parseDate(endTime));
        endDate.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
        if (endDate.before(beginDate)) {
            endDate.add(Calendar.DATE, 1);
        }
        return date.after(beginDate) && date.before(endDate);
    }

    public static boolean compareTimes(Date time, Date beginTime, Date endTime) {
        Calendar date = Calendar.getInstance();
        date.setTime(time);
        Calendar beginDate = Calendar.getInstance();
        beginDate.setTime(beginTime);
        beginDate.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(endTime);
        endDate.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
        if (endDate.before(beginDate)) {
            endDate.add(Calendar.DATE, 1);
        }
        return date.after(beginDate) && date.before(endDate);
    }

    public static boolean compareDayTimes(Date time, Date beginTime, Date endTime) {
        Calendar date = Calendar.getInstance();
        date.setTime(time);
        Calendar beginDate = Calendar.getInstance();
        beginDate.setTime(beginTime);
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(endTime);
        return (date.after(beginDate) || (date.get(Calendar.YEAR) == beginDate.get(Calendar.YEAR)) && date.get(Calendar.MONTH) == beginDate.get(Calendar.MONTH)
                && date.get(Calendar.DAY_OF_MONTH) == beginDate.get(Calendar.DAY_OF_MONTH))
                && (date.before(endDate) || (date.get(Calendar.YEAR) == endDate.get(Calendar.YEAR)) && date.get(Calendar.MONTH) == endDate.get(Calendar.MONTH)
                && date.get(Calendar.DAY_OF_MONTH) == endDate.get(Calendar.DAY_OF_MONTH));
    }

    public static boolean inBetween(Date time, Date beginTime, Date endTime) {
        Calendar date = Calendar.getInstance();
        date.setTime(time);
        Calendar beginDate = Calendar.getInstance();
        beginDate.setTime(beginTime);
        // beginDate.set(date.get(Calendar.YEAR),
        // date.get(Calendar.MONTH),date.get(Calendar.DAY_OF_MONTH));
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(endTime);
        // endDate.set(date.get(Calendar.YEAR),
        // date.get(Calendar.MONTH),date.get(Calendar.DAY_OF_MONTH));
        if (endDate.before(beginDate)) {
            endDate.add(Calendar.DATE, 1);
        }
        return date.after(beginDate) && date.before(endDate);
    }

    // public static boolean inBetweenDate(String beginTime, String endTime) {
    // Date dateCompareOne = null;
    // Date dateCompareTwo = null;
    // Date curDate = null;
    // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd",
    // Locale.US);
    // try {
    // dateCompareOne = (Date) formatter.parse(beginTime);
    // dateCompareTwo = (Date) formatter.parse(endTime);
    // // Date curDate = new Date(System.currentTimeMillis());
    //
    // Calendar now = Calendar.getInstance();
    // curDate = (Date) formatter.parse(String.valueOf(now
    // .get(Calendar.YEAR))
    // + "-"
    // + String.valueOf(now.get(Calendar.MONTH) + 1)
    // + "-"
    // + String.valueOf(now.get(Calendar.DATE)));
    // } catch (java.text.ParseException e) {
    // // // TODO Auto-generated catch block
    // e.printStackTrace();
    // return false;
    // }
    // if (curDate.before(dateCompareOne) || curDate.after(dateCompareTwo))
    // {
    // return false;
    // } else {
    // return true;
    // }
    // }

    // public static boolean inBetween (String beginTime,String endTime)
    // {
    // Date dateCompareOne = null;
    // Date dateCompareTwo = null;
    //
    // SimpleDateFormat formatter = new
    // SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.US);
    // try {
    // dateCompareOne = (Date) formatter.parse(beginTime);
    // dateCompareTwo = (Date) formatter.parse(endTime);
    // Date curDate = new Date(System.currentTimeMillis());
    // Calendar now = Calendar.getInstance();
    //
    // if (dateCompareOne.before(curDate) && dateCompareTwo.after(curDate)) {
    // return true;
    // } else {
    // return false;
    // }
    // } catch (ParseException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // return false;
    // }
    // }
    public synchronized static boolean isFutureDate(String futureDate) {
        boolean result = false;

        try {
            Date dateCompareOne = (Date) defaultFormatter.parse(futureDate);
            Date curDate = new Date(System.currentTimeMillis());
            result = dateCompareOne.after(curDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;

    }

    public synchronized static boolean isFutureDate(Date futureDate) {
        boolean result = false;

        Date curDate = new Date(System.currentTimeMillis());
        result = futureDate.after(curDate);
        return result;

    }

    public static String currentTimeNoSecond() {
        Date now = new Date();
        String formattedTime = systemDateFormater.format(now);
        return formattedTime;
    }

    public static String currentTime() {

        // Calendar now = Calendar.getInstance();
        //
        // int hour = now.get(Calendar.HOUR);
        // int minute = now.get(Calendar.MINUTE);
        //
        // String current = Integer.toString(hour) + ":"
        // + Integer.toString(minute);

        Date now = new Date();
        // SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formattedTime = inputParser.format(now);
        return formattedTime;
    }

    public static List<Date> getDays(Date startTime, Date endTime) {
        List<Date> days = new ArrayList<Date>();
        Date day = new Date(startTime.getYear(), startTime.getMonth(), startTime.getDate());
        while (day.before(endTime)) {
            days.add(day);
            day = new Date(day.getTime() + 1000 * 60 * 60 * 24);
        }
        return days;

    }

    public static String now() {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        Date curDate = new Date(System.currentTimeMillis());
        String str = formatter.format(curDate);
        return str;
    }

    public static String currentDate() {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Date curDate = new Date(System.currentTimeMillis());
        String str = formatter.format(curDate);
        return str;
    }

    private static Date parseDate(String date) {
        try {
            return (Date) inputParser.parse(date);
        } catch (ParseException e) {
            return new Date(0);
        }
    }
}
