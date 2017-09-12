package com.zxn.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @Description: 日期工具类
 * @author ZhangXiaoNan
 * @date 2017年9月12日 下午5:28:32
 */
public class DateUtil {
	public final static SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
	public final static SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
	public final static SimpleDateFormat sdfDays = new SimpleDateFormat("yyyyMMdd");
	public final static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public final static SimpleDateFormat sdflong = new SimpleDateFormat("yyyyMMddHHmmssSSS");//
	public final static SimpleDateFormat sdfMonth = new SimpleDateFormat("yyyy-MM");
	public final static SimpleDateFormat sdfOnlyDay = new SimpleDateFormat("dd");
	public final static SimpleDateFormat sdfOnlyMonth = new SimpleDateFormat("MM");

	/**
	 * 获取YYYY格式
	 * 
	 * @return
	 */
	public static String getYear() {
		return sdfYear.format(new Date());
	}

	/**
	 * @Description 获取月份
	 * @author 张孝楠
	 * @date 2017-3-1
	 * @return 11
	 */
	public static String getMonth() {
		return sdfOnlyMonth.format(new Date());
	}

	/**
	 * @Description 获取当前时间数字型--毫秒
	 * @author zxn
	 * @date 2016-8-5
	 * @return
	 */
	public static String getLongTime() {
		return sdflong.format(new Date());
	}

	/**
	 * 获取YYYY-MM-DD格式
	 * 
	 * @return
	 */
	public static String getDay() {
		return sdfDay.format(new Date());
	}

	/**
	 * @Description 获取YYYY-MM-DD格式
	 * @author 张孝楠
	 * @date 2017-3-9
	 * @param date
	 * @return
	 */
	public static String getDay(Date date) {
		return sdfDay.format(date);
	}

	/**
	 * @Description 获取YYYY-MM格式
	 * @author zxn
	 * @date 2016-7-11
	 * @return
	 */
	public static String getYearMonth() {
		return sdfMonth.format(new Date());
	}

	/**
	 * 获取YYYYMMDD格式
	 * 
	 * @return
	 */
	public static String getDays() {
		return sdfDays.format(new Date());
	}

	/**
	 * 获取YYYY-MM-DD HH:mm:ss格式
	 * 
	 * @return
	 */
	public static String getTime() {
		return sdfTime.format(new Date());
	}

	public static String getTime(Date date) {
		return sdfTime.format(date);
	}

	/**
	 * @Description 格式化日期为天
	 * @author zxn
	 * @date 2016-7-11
	 * @param date
	 * @return 天
	 */
	public static String formatToDay(Date date) {
		return sdfOnlyDay.format(date);
	}

	public static String formatToDay() {
		return sdfOnlyDay.format(new Date());
	}

	/**
	 * @Title: compareDate
	 * @Description: (日期比较，如果s>=e 返回true 否则返回false)
	 * @param s
	 * @param e
	 * @return boolean
	 * @throws
	 * @author luguosui
	 */
	public static boolean compareDate(String s, String e) {
		if (fomatDate(s) == null || fomatDate(e) == null) {
			return false;
		}
		return fomatDate(s).getTime() >= fomatDate(e).getTime();
	}

	/**
	 * 格式化日期
	 * 
	 * @return
	 */
	public static Date fomatDate(String date) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return fmt.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 校验日期是否合法
	 * 
	 * @return
	 */
	public static boolean isValidDate(String s) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fmt.parse(s);
			return true;
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			return false;
		}
	}

	public static int getDiffYear(String startTime, String endTime) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			int years = (int) (((fmt.parse(endTime).getTime() - fmt.parse(startTime).getTime()) / (1000 * 60 * 60 * 24)) / 365);
			return years;
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			return 0;
		}
	}

	/**
	 * <li>功能描述：时间相减得到天数
	 * 
	 * @param beginDateStr
	 * @param endDateStr
	 * @return
	 *         long
	 * @author Administrator
	 */
	public static long getDaySub(String beginDateStr, String endDateStr) {
		long day = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.util.Date beginDate = null;
		java.util.Date endDate = null;

		try {
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
		// System.out.println("相隔的天数="+day);
		return day;
	}

	/**
	 * @Description 比较两个时间相减得到毫秒差
	 * @author zxn
	 * @date 2016-8-2
	 * @param beginDateStr 开始时间
	 * @param endDateStr 结束时间
	 * @return 相差毫秒数
	 */
	public static long getDayTimeSub(String beginDateStr, String endDateStr) {
		long day = 0;
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date beginDate = null;
		java.util.Date endDate = null;

		try {
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		day = endDate.getTime() - beginDate.getTime();
		// System.out.println("相隔的天数="+day);
		return day;
	}

	/**
	 * @Description 获取n个月之后的时间
	 * @author zxn
	 * @date 2016-7-27
	 * @param monty 月数
	 * @return
	 */
	public static Date getAfterMonthDay(int month) {
		Calendar calendar = Calendar.getInstance();// 创建实例
		calendar.setTime(DateUtil.getNowTime());
		calendar.add(Calendar.MONTH, month);// 三个月后的日期
		return calendar.getTime();// 三个月后的日期（Date类型）
	}

	public static Date getAfterMonthDay(int month, Date date) {
		Calendar calendar = Calendar.getInstance();// 创建实例
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, month);// 三个月后的日期
		return calendar.getTime();// 三个月后的日期（Date类型）
	}

	/**
	 * @Description 获取n天之后的日期
	 * @author zxn
	 * @date 2016-7-7
	 * @param days 天(正数:n天后 负数:n天前)
	 * @return Wed Jul 06 00:00:00 CST 2016
	 */
	public static Date getAfterDayDate(int days) {
		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.add(Calendar.DATE, days); // 日期减 如果不够减会将月变动
		Date date = canlendar.getTime();
		SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = sdfd.format(date);

		return DateUtil.fomatDate(dateStr);
	}

	/**
	 * @Description 获取n天之后的日期
	 * @author zxn
	 * @date 2016-7-7
	 * @param days 天(正数:n天后 负数:n天前)
	 * @return Wed Jul 06 00:00:00 CST 2016
	 */
	public static Date getAfterDayDate(int days, Date dateParm) {
		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.setTime(dateParm);
		canlendar.add(Calendar.DATE, days); // 日期减 如果不够减会将月变动
		Date date = canlendar.getTime();
		SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = sdfd.format(date);

		return DateUtil.fomatDate(dateStr);
	}

	public static String getAfterDay(int days, Date dateParm) {
		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.setTime(dateParm);
		canlendar.add(Calendar.DATE, days); // 日期减 如果不够减会将月变动
		Date date = canlendar.getTime();
		SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = sdfd.format(date);

		return dateStr;
	}

	/**
	 * @Description 获取n天之后的日期
	 * @author zxn
	 * @date 2016-7-7
	 * @param days 天(正数:n天后 负数:n天前)
	 * @return Wed Jul 06 00:00:00 CST 2016
	 */
	public static String getAfterDayDate(String days) {
		int daysInt = Integer.parseInt(days);

		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
		Date date = canlendar.getTime();

		SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = sdfd.format(date);

		return dateStr;
	}

	/**
	 * 得到n天之后是周几
	 * 
	 * @param days
	 * @return
	 */
	public static String getAfterDayWeek(String days) {
		int daysInt = Integer.parseInt(days);

		Calendar canlendar = Calendar.getInstance(); // java.util包
		canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
		Date date = canlendar.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("E");
		String dateStr = sdf.format(date);

		return dateStr;
	}

	/**
	 * @Description 得到年月日时分秒
	 * @author zxn
	 * @date 2016-7-5
	 * @return
	 */
	public static String getNowtime() {
		Calendar calendar = new GregorianCalendar();
		return calendar.get(Calendar.YEAR) + "" + (calendar.get(Calendar.MONTH) + 1) + "" + calendar.get(Calendar.DAY_OF_MONTH) + ""
				+ calendar.get(Calendar.HOUR_OF_DAY) + "" + calendar.get(Calendar.MINUTE) + "" + calendar.get(Calendar.SECOND) + ""
				+ calendar.get(Calendar.MILLISECOND);
	}

	/**
	 * @Description 比较两个时间相差秒数
	 * @author zxn
	 * @date 2016-7-4
	 * @param start 开始时间
	 * @param end 结束时间
	 * @return
	 */
	public static long subTime(Date start, Date end) {
		return (start.getTime() - end.getTime()) / 1000;
	}

	/**
	 * @Description 获取当前时间
	 * @author zxn
	 * @date 2016-7-4
	 * @return Tue Jul 05 01:02:03 CST 2016
	 */
	public static Date getNowTime() {
		return new Date();
	}

	/**
	 * @Description 获取今天0点0分
	 * @author zxn
	 * @date 2016-7-5
	 * @return Tue Jul 05 00:00:00 CST 2016
	 */
	public static Date getTodayBegin() {
		return DateUtil.fomatDate(DateUtil.getDay());
	}

	/**
	 * @Description 获取上个月的月份
	 * @author zxn
	 * @date 2016-7-11
	 * @return 2016-06
	 */
	public static String getMonthLast() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, -1);
		return sdfMonth.format(cal.getTime());
	}

	/**
	 * @Description: 获得两个日期之间的所有日期
	 * @author ZXN
	 * @date 2015-9-21 下午03:32:21
	 * @param startDate 2015-09-21
	 * @param endDate 2015-11-13
	 * @return List<String> String日期格式"yyyy-MM-dd"的集合
	 */
	public static List<String> getDates(String startDate, String endDate) {
		List<String> result = new ArrayList<String>();
		if (startDate.equals(endDate)) {
			return result;
		}
		Calendar startDay = Calendar.getInstance();
		Calendar endDay = Calendar.getInstance();
		startDay.setTime(fomatDate(startDate));
		endDay.setTime(fomatDate(startDate));
		Calendar temp = (Calendar) startDay.clone();
		temp.add(Calendar.DAY_OF_YEAR, 1);
		result.add(startDate);
		while (temp.before(endDay)) {
			result.add(getDay(temp.getTime()));
			temp.add(Calendar.DAY_OF_YEAR, 1);
		}
		result.add(endDate);
		return result;
	}

	/**
	 * @Description: 获得两个月之间的所有月
	 * @author ZXN
	 * @date 2015-9-22 上午10:28:02
	 * @param minDate 2015-01
	 * @param maxDate 2016-07
	 * @return List<String>
	 * @throws ParseException
	 */
	public static List<String> getMonthBetween(String minDate, String maxDate) throws ParseException {
		ArrayList<String> result = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");// 格式化为年月

		Calendar min = Calendar.getInstance();
		Calendar max = Calendar.getInstance();

		min.setTime(sdf.parse(minDate));
		min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

		max.setTime(sdf.parse(maxDate));
		max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

		Calendar curr = min;
		while (curr.before(max)) {
			result.add(sdf.format(curr.getTime()));
			curr.add(Calendar.MONTH, 1);
		}

		return result;
	}

	/**
	 * @Description: 获取某年某月最后一天
	 * @author ZXN
	 * @date 2015-9-22 下午02:10:25
	 * @param date 2015-02
	 * @return
	 */
	public static String getLastDayOfMonth(String date) {
		int year = Integer.parseInt(date.split("-")[0]);
		int month = Integer.parseInt(date.split("-")[1]);
		Calendar cal = Calendar.getInstance();
		// 设置年份
		cal.set(Calendar.YEAR, year);
		// 设置月份
		cal.set(Calendar.MONTH, month - 1);
		// 获取某月最大天数
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 设置日历中月份的最大天数
		cal.set(Calendar.DAY_OF_MONTH, lastDay);
		// 格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String lastDayOfMonth = sdf.format(cal.getTime());

		return lastDayOfMonth;
	}

	/**
	 * @Description: 获取某年某月第一天
	 * @author ZXN
	 * @date 2015-9-22 下午02:11:56
	 * @param date 2015-02
	 * @return
	 */
	public static String getFirstDayOfMonth(String date) {
		int year = Integer.parseInt(date.split("-")[0]);
		int month = Integer.parseInt(date.split("-")[1]);
		Calendar cal = Calendar.getInstance();
		// 设置年份
		cal.set(Calendar.YEAR, year);
		// 设置月份
		cal.set(Calendar.MONTH, month - 1);
		// 获取某月最小天数
		int lastDay = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
		// 设置日历中月份的最大天数
		cal.set(Calendar.DAY_OF_MONTH, lastDay);
		// 格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String lastDayOfMonth = sdf.format(cal.getTime());
		return lastDayOfMonth;
	}

	/**
	 * @Description 获取N小时之后(前--负数)的日期时间
	 * @author zxn
	 * @date 2016-8-4
	 * @param hours n小时
	 * @return
	 */
	public static Date beforeHourToNowDate(Integer hours) {
		Calendar calendar = Calendar.getInstance();
		/* HOUR_OF_DAY 指示一天中的小时 */
		calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) + hours);
		return calendar.getTime();
	}

	/**
	 * @Description:获取N分钟之后(前--负数)的日期时间
	 * @author ZXN
	 * @date 2016年9月20日 下午4:52:30
	 * @param minit
	 * @param date
	 * @return
	 */
	public static Date beforeMɪnɪtDate(Integer minit, Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) + minit);
		return calendar.getTime();
	}
}
