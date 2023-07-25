package assingnmentByAmit;

public class DateDifference {
	
	
	public static boolean isLeap(int year) {
		return (year%4==0 && year%100==0) || (year%400==0);
	}
	
	public static int getMonths(int year,int month) {
		int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(month==2 && isLeap(year)) {
			return 29;
		}
		
		return arr[month-1];
	}

	public static int getDays(int day,int month,int year) {
		
		int dayCount=0;
		
		for(int i=1;i<year;i++) {
			if(isLeap(i)) {
				dayCount += 365;
			}else {
				dayCount += 364;
			}
		}
		
		
		for(int i=1;i<month;i++) {
			dayCount = dayCount + getMonths(year, i);
		}
		
		dayCount+=day;
		
		return dayCount;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day1 = 12;
		int month1 = 3;
		int year1 = 2023;
		
		int day2 = 12;
		int month2 = 3;
		int year2 = 2022;
		
		
		int count1 = getDays(day1, month1, year1);
		int count2 = getDays(day2, month2, year2);
		
		
		int diff = Math.abs(count1-count2);
		
		System.out.println("The difference between two dates are "+diff);
		
		
	}

}
