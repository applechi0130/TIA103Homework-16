package Hw1;

import java.util.Scanner;

public class Hw04_5 {
//			請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//			例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」(提示1:Scanner,陣列)
//			(提示2:需將閏年條件加入)(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

//			判斷是否為閏年
//	System.out.println("第五題===============");
	private static boolean isLeapYear(int year) {

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

//			獲取指定月份的天數
	private static int getDaysInMonth(int year, int month) {
//			每個月的天數,非閏年情況
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && isLeapYear(year)) {
			return 29; // 閏年2月有29天
		} else {
			return daysInMonth[month - 1];
		}
	}

//			計算指定日期是該年的第幾天
	private static int calculateDayOfYear(int year, int month, int day) {
		int dayOfYear = 0;
		for (int i = 1; i < month; i++) {
			dayOfYear += getDaysInMonth(year, i);
		}
		dayOfYear += day;
		return dayOfYear;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("請輸入年份(yyyy):");
		int year = s.nextInt();
		System.out.println("請輸入月份(mm):");
		int month = s.nextInt();
//		檢查月份是否合法
		if(month < 1 || month > 12) {
			System.out.println("錯誤:月份無效");
			return;
		}
		System.out.println("請輸入日期(dd):");
		int day = s.nextInt();
//		檢查其是否合法
		if(day < 1 || day > getDaysInMonth(year,month)) {
			System.out.println("錯誤:日期無效");
			return;
		}
		
//		計算並輸出結果
		int dayOfYear = calculateDayOfYear(year,month,day);
		System.out.println("輸入的日期為該年第 " + dayOfYear + "天");
		s.close();
						
	}
}