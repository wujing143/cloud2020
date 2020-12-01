package com.atguigu.springcloud.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 时间工具类
 * @author: HHF
 * @date: 2020/11/26
 **/
public class DateUtil {
    private static final Pattern DATE_PATTERN = Pattern.compile("\\d{4}\\-((0[1-9])|(1[0-2]))\\-((0[1-9])|([1-2]\\d)|(3[0-1]))");

    private static final Pattern FULL_DATE_PATTERN = Pattern.compile("\\d{4}\\-((0[1-9])|(1[0-2]))\\-((0[1-9])|([1-2]\\d)|(3[0-1]))\\s([0-1]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)");

    public static final String DAY_STYLE = "yyyy-MM-dd";

    public static final String DAY_TIME_STYLE = "yyyy-MM-dd HH:mm:ss";

    /**
     * 判断是否是yyyy-MM-dd格式时间
     * @param strDate
     * @return
     */
    public static boolean isDate(String strDate) {
        return (null == strDate || "".equals(strDate)) ? false : DATE_PATTERN.matcher(strDate).matches();
    }
    /**
     * 判断是否是yyyy-MM-dd HH:mm:ss格式时间
     * @param strDate
     * @return
     */
    public static boolean isFullDate(String strDate) {
        return (null == strDate || "".equals(strDate)) ? false : FULL_DATE_PATTERN.matcher(strDate).matches();
    }

    /**
     * 转换成yyyy-MM-dd时间格式字符串
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        return (null == date) ? "" : format(date, "yyyy-MM-dd");
    }

    /**
     * 转换成yyyy-MM-dd HH:mm:ss时间格式字符串
     * @param date
     * @return
     */
    public static String formatFullDate(Date date) {
        return (null == date) ? "" : format(date, "yyyy-MM-dd HH:mm:ss");
    }


    public static String format(Date date, String format) {
        return (new SimpleDateFormat(format)).format(date);
    }

    public static Date parse(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * d1是否是更靠后的时间
     * @param d1
     * @param d2
     * @return
     */
    public static boolean isAfter(Date d1, Date d2) {
        return (d1.compareTo(d2) > 0);
    }

    /**
     * d1是否是更早的时间
     * @param d1
     * @param d2
     * @return
     */
    public static boolean isBefore(Date d1, Date d2) {
        return (d1.compareTo(d2) < 0);
    }

    /**
     * 增加xx分钟
     * @param d     时间
     * @param amount 增加分钟数
     * @return
     */
    public static Date addMinutes(Date d, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.MINUTE, amount);
        return new Date(c.getTimeInMillis());
    }

    /**
     * 增加xx天
     * @param d     时间
     * @param amount 增加天数
     * @return
     */
    public static Date addDays(Date d, int amount) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DATE, amount);
        return new Date(c.getTimeInMillis());
    }

    /**
     * 增加时间
     * @param d     时间
     * @param amount    增加数量
     * @param unit      单位
     * @return
     */
    public static Date add(Date d, int amount, Unit unit) {
        int calendar_field = Unit.SECOND == unit ? Calendar.SECOND : (Unit.MINUTE == unit ? Calendar.MINUTE : (Unit.HOUR == unit ? Calendar.HOUR : (Unit.DAY == unit ? Calendar.DATE : Calendar.ERA)));
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(calendar_field, amount);
        return new Date(c.getTimeInMillis());
    }

    /**
     * 比较两个日期之间的分钟数差
     * @param d1
     * @param d2
     * @return
     */
    public static int diffMinutes(Date d1, Date d2) {
        return diff(d1, d2, Unit.MINUTE);
    }

    /**
     * 比较两个日期之间的小时差
     * @param d1
     * @param d2
     * @return
     */
    public static int diffHours(Date d1, Date d2) {
        return diff(d1, d2, Unit.HOUR);
    }

    /**
     * 比较两个日期之间的天数差
     * @param d1
     * @param d2
     * @return
     */
    public static int diffDays(Date d1, Date d2) {
        return diff(d1, d2, Unit.DAY);
    }

    /**
     * 比较两个日期之间的差值
     * @param d1
     * @param d2
     * @param unit
     * @return
     */
    public static int diff(Date d1, Date d2, Unit unit) {
        return (int)(d1.getTime() / unit.getCount() - d2.getTime() / unit.getCount());
    }

    /**
     * 时间相减
     * @param d1    时间
     * @param amount 减去数量
     * @param unit  数量单位
     * @return
     */
    public static Date sub(Date d1, int amount, Unit unit) {
        return new Date(d1.getTime() - unit.getCount() * amount);
    }

    public static void main(String[] args) {
        Date d = parse("2017-12-28 21:00:01", "yyyy-MM-dd HH:mm:ss");
        Date d2 = parse("2017-12-29 22:00:00", "yyyy-MM-dd HH:mm:ss");
       /* System.out.println(com.io.icos.common.util.DateUtil.diffDays(d2, d));*/
    }


    public static enum Unit{
        SECOND(1000),
        MINUTE(60000),
        HOUR(3600000),
        DAY(86400000);

        private int count;

        Unit(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }
    }

}
