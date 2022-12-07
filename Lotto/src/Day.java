import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

class day1 {
	day1() {

		
		
		// 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
		LocalDate today = LocalDate.now();

		// 특정 날짜 구하기
		// static LocalDate of(int year, int month, int dayOfMonth)
		LocalDate xMas = LocalDate.of(2022, 12, 25);

		System.out.println(today); // 2022-01-21
		System.out.println(xMas); // 2022-12-25
		
		// 현재 시간 구하기 (시스템 시계, 시스템 타임존)
		LocalTime present = LocalTime.now();

		// 특정 시간 구하기
		// static LocalTime of(int hour, int minute, int second, int nanoOfSecond)
		LocalTime xMasTime = LocalTime.of(02, 02, 00, 100000000);

		System.out.println(present); // 09:21:50.634
		System.out.println(xMas); // 02:02:00.100
	}

}

public class Day {
	public static void main(String[] args) {
		new day1();

	}

}
